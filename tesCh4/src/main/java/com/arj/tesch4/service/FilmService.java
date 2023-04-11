package com.arj.tesch4.service;

import com.arj.tesch4.model.FilmEntity;
import com.arj.tesch4.repo.FilmRePo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.management.RuntimeErrorException;
import java.util.List;
import java.util.Optional;

@Service
public class FilmService {

    @Autowired
    FilmRePo filmRePo;

    public List<FilmEntity> findAll(){
        return filmRePo.findAll();
    }

    public FilmEntity addFilm(FilmEntity param){
        Optional<FilmEntity> film = filmRePo.findById(param.getFilmCode());
        if(film.isPresent()){
            throw new RuntimeException("Film Code " + "'" + param.getFilmCode() + "'" + " Already Exists");
        }else {
            return filmRePo.save(param);
        }
    }

    public FilmEntity updateFilm(FilmEntity param){
        FilmEntity updateFilm = filmRePo.findById(param.getFilmCode()).get();
        updateFilm.setFilmName(param.getFilmName());
        updateFilm.setTayangAtauTidak(param.getTayangAtauTidak());
        return filmRePo.save(updateFilm);
    }

    /*public void deteleFilms(FilmEntity param){
        filmRePo.delete(param);
    }*/

    public FilmEntity deleteFilm(FilmEntity param){
        FilmEntity deleteFilm = filmRePo.findById(param.getFilmCode()).get();
        filmRePo.delete(param);
        return deleteFilm;
    }

    public Page<FilmEntity> getAllFilm(int page, int pageSize){
        Pageable pageable = PageRequest.of(page,pageSize);
        return filmRePo.findAll(pageable);
    }


}
