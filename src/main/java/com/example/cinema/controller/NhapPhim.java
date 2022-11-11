package com.example.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.cinema.model.NhaCungCap;
import com.example.cinema.model.Phim;
import com.example.cinema.repository.NhaCungCapDAO;
import com.example.cinema.repository.PhimDAO;

@Controller
public class NhapPhim {
    @Autowired
    private NhaCungCapDAO nhaCungCapDAO;
    @Autowired
    private PhimDAO phimDAO;
    @GetMapping("/nhapphim/SearchNcc")
    public String getSearchNcc(@Param("keyword") String keyword,Model model){
        if(keyword == null) return "SearchEditNccView" ;
        List<NhaCungCap> listNcc = nhaCungCapDAO.findAllByTenContaining(keyword);
        model.addAttribute("listNcc", listNcc);
        return "SearchNccView";
    }
    @GetMapping("/nhapphim/ncc/{id}")
    public String getSearchPhim(@PathVariable String id,@Param("keyword") String keyword,Model model){
        if(keyword == null) return "SearchPhimView" ;
        List<Phim> listPhim = phimDAO.findAllByNcc(Integer.parseInt(id),keyword);
        System.out.println(listPhim);
        model.addAttribute(listPhim);
        return "SearchPhimView";
    }
}
