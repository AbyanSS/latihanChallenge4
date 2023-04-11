package com.arj.tesch4.service;


import com.arj.tesch4.model.SeatEntity;
import com.arj.tesch4.repo.SeatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {

    @Autowired
    SeatRepo seatRepo;

    public List<SeatEntity> findAllSeat(){
        return seatRepo.findAll();
    }

}
