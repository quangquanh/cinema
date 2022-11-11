package com.example.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cinema.model.ThanhVien;

public interface ThanhVienDAO extends JpaRepository<ThanhVien,Integer> {
    ThanhVien findByUserName(String userName);
}
