package com.arj.tesch4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Entity
@Data
@Table(name = "schedules")
public class ScheduleEntity {

    @Getter @Setter
    @Id
    private int scheduleId;
    private String filmCode;
    private Date tanggalTayang;
    private Time jamMulai;
    private Time jamSelesai;
    private int hargaTiket;

}
