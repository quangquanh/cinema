package com.example.cinema.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity(name = "tblLoaiGhe")
public class LoaiGhe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ten;
    private int giaLoaiGhe;
    @OneToMany(mappedBy = "loaiGhe")
    private Collection<GheChieu> listGheChieu;
    
}
