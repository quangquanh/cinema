package com.example.cinema.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity(name = "tblRapPhim")
public class RapPhim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ten;
    private String moTa;
    private String diaChi;
    @OneToMany(mappedBy = "rapPhim")
    private Collection<PhongChieu> listPhongChieu;
}
