package com.example.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.cinema.Dtos.AuthDTO;
import com.example.cinema.model.ThanhVien;
import com.example.cinema.repository.ThanhVienDAO;

@Controller
public class Login {
    @Autowired
    private ThanhVienDAO thanhVienDAO;
    @GetMapping("/")
    public String getLogin() {
        return "loginview";
    }
    @PostMapping("/")
    public String postLogin(@ModelAttribute AuthDTO authDTO){
        ThanhVien t = thanhVienDAO.findByUserName(authDTO.getUserName());
        if(t == null) return "404 user not found";
        if(!authDTO.getPassword().equals(t.getPassword())){
            return "passwordwrong";
        }
        return "quanlihomeview";
    }
}
