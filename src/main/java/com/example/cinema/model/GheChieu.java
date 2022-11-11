package com.example.cinema.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity(name = "tblGheChieu")
public class GheChieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ten;
    private String hang;
    private int so;
    @OneToMany(mappedBy = "gheChieu")
    private Collection<VeChieu> listVeChieu;
    @OneToMany(mappedBy = "gheChieu")
    @ManyToOne
    @JoinColumn(name = "loai_ghe_id")
    private LoaiGhe loaiGhe;
    @ManyToOne
    @JoinColumn(name = "phong_chieu_id")
    private PhongChieu phongChieu;
}
