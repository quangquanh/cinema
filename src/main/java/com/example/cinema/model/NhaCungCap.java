package com.example.cinema.model;




import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity(name = "tblNhaCungCap")
@Data
public class NhaCungCap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ten;
    private String diachi;
    private String email;
    private String sdt;
    private String mota;
    @OneToMany(mappedBy = "nhaCungCap")
    private Collection<HoaDonNhap> listHoaDonNhap;
}
