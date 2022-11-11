package com.example.cinema.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity(name = "tblPhim")
public class Phim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ten;
    private String moTa;
    private Date ngayCongChieu;
    private String daoDien;
    private String dienVien;
    private String namSx;
    private int giaNhapPhim;
    @OneToMany(mappedBy = "phim")
    private Collection<HoaDonNhap> listHoaDonNhap;
    @OneToMany(mappedBy = "phim")
    private Collection<SuatChieu> listSuatChieu;
    @ManyToMany
    @JoinTable(name = "tbl_TheLoai_Phim",joinColumns = @JoinColumn(name="phim_id"),inverseJoinColumns = @JoinColumn(name="the_loai_id"))
    private Collection<TheLoai> listTheLoai;
}
