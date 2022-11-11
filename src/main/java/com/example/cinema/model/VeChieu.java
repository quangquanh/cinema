package com.example.cinema.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity(name = "tblVeChieu")
public class VeChieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date ngayBan;
    @ManyToOne
    @JoinColumn(name = "suat_chieu_id")
    private SuatChieu suatChieu;
    @ManyToOne
    @JoinColumn(name = "ghe_chieu_id")
    private GheChieu gheChieu;
    @ManyToOne()
    @JoinColumn(name = "thanh_vien_id")
    private ThanhVien thanhVien;
}
