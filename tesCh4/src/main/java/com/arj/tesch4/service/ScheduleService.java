package com.arj.tesch4.service;

import com.arj.tesch4.model.ScheduleEntity;
import com.arj.tesch4.repo.ScheduleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    @Autowired
    ScheduleRepo scheduleRepo;

    public List<ScheduleEntity> findAllSchedule(){
        return scheduleRepo.findAll();
    }


}
