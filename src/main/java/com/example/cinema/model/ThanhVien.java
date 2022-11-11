package com.example.cinema.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity(name = "tblThanhVien")
@Data
public class ThanhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ten;
    private String userName;
    private String address;
    private String password;
    private Date dob;
    private String email;
    private String sdt;
    private String vi_tri;
    @OneToMany(mappedBy = "thanhVien")
    private Collection<VeChieu> listVeChieu;
}
