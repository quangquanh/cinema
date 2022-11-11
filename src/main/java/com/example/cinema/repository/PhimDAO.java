package com.example.cinema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.cinema.model.Phim;
@Repository
public interface PhimDAO extends JpaRepository<Phim,Integer>  {
    @Query(value =  "SELECT tbl_phim.* FROM tbl_phim INNER JOIN tbl_hoa_don_nhap ON tbl_phim.id = tbl_hoa_don_nhap.phim_id WHERE tbl_phim.ten LIKE '%:ten%' AND tbl_hoa_don_nhap.nha_cung_cap_id = :id",  nativeQuery = true)
    public List<Phim> findAllByNcc(@Param("id") int id, @Param("ten") String ten);

}
