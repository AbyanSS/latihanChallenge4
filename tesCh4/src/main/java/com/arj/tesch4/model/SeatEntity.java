package com.arj.tesch4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "seats")
public class SeatEntity {

    @Setter @Getter
    @Id
    private int noKursi;
    private char studioName;

}
