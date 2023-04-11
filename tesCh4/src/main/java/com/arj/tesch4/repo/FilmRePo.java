package com.arj.tesch4.repo;

import com.arj.tesch4.model.FilmEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRePo extends JpaRepository<FilmEntity, String> {
    Page<FilmEntity> findAll(Pageable pageable);
}
