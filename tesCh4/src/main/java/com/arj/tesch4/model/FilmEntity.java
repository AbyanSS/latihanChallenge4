package com.arj.tesch4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "films")
@Getter @Setter
public class FilmEntity {
    @Id
    private String filmCode;
    private String filmName;
    private String tayangAtauTidak;
}
