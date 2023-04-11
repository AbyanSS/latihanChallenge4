package com.arj.tesch4.controller;


import com.arj.tesch4.model.ScheduleEntity;
import com.arj.tesch4.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "schedule")
public class ScheduleController {

    @Autowired
    ScheduleService scheduleService;

    @GetMapping
    public List<ScheduleEntity> findAllSchedule(){
        return scheduleService.findAllSchedule();
    }

}
