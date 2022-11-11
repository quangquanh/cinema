package com.example.cinema.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cinema.model.NhaCungCap;


public interface NhaCungCapDAO extends JpaRepository<NhaCungCap,Integer> {
    List<NhaCungCap> findAllByTenContaining(String ten);
}
