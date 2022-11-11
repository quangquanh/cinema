package com.example.cinema.model;

import java.sql.Time;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity(name = "tblSuatChieu")
public class SuatChieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Time gioBatDau;
    private Time gioKetThuc;
    private Date ngayChieu;
    private int giaVeTrongSuatChieu;
    @ManyToOne
    @JoinColumn(name = "phim_id")
    private Phim phim;
    @OneToMany(mappedBy = "suatChieu")
    private Collection<PhongChieu> listPhongChieu;
    @OneToMany(mappedBy = "suatChieu")
    private Collection<VeChieu> listVeChieu;
}
