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
@Entity(name = "tblPhongChieu")
public class PhongChieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int sucChua;
    private String moTa;
    @ManyToOne
    @JoinColumn(name = "suat_chieu_id")
    private SuatChieu suatChieu;
    @ManyToOne
    @JoinColumn(name = "rap_phim_id")
    private RapPhim rapPhim;
    @OneToMany(mappedBy = "phongChieu")
    private Collection<GheChieu> listGheChieu;
}
