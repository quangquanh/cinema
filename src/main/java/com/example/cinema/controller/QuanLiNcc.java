package com.example.cinema.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.cinema.model.NhaCungCap;
import com.example.cinema.repository.NhaCungCapDAO;

@Controller
public class QuanLiNcc {
    @Autowired
    private NhaCungCapDAO nhaCungCapDAO;
    @GetMapping("/manage")
    public String getManage(){
        return "QuanLiThongTinNccView";
    }
    @GetMapping("/manage/add")
    public String getAddManage(){
        return "ThemNccView";
    }
    @PostMapping("/manage/add")
    public String postAddManage(@ModelAttribute NhaCungCap nhaCungCap){
        nhaCungCapDAO.save(nhaCungCap);
        return "redirect:/manage";
    }
    @GetMapping("/manage/edit/search")
    public String getEditSearch(@Param("keyword") String keyword,Model model){
        if(keyword == null) return "SearchEditNccView" ;
        List<NhaCungCap> listNcc = nhaCungCapDAO.findAllByTenContaining(keyword);
        model.addAttribute("listNcc", listNcc);
        return "SearchEditNccView";
    }
    @GetMapping("/manage/edit/{id}")
    public String getEdit(@PathVariable String id,Model model){
        Optional<NhaCungCap> nhaCungCap = nhaCungCapDAO.findById(Integer.parseInt(id));
        if(nhaCungCap.isEmpty()) return "NotFound"; 
         model.addAttribute("nhaCungCap", nhaCungCap.get());
        return "SuaNccView";
    }
    @PostMapping("/manage/edit/{id}")
    public String postEdit(@PathVariable String id,@ModelAttribute NhaCungCap nhaCungCap){
        nhaCungCapDAO.save(nhaCungCap);
        return "redirect:/manage/edit/search";
    }
    @GetMapping("/manage/delete/search")
    public String getDeleteSearch(@Param("keyword") String keyword,Model model){
        if(keyword == null) return "SearchDeleteNccView" ;
        List<NhaCungCap> listNcc = nhaCungCapDAO.findAllByTenContaining(keyword);
        model.addAttribute("listNcc", listNcc);
        return "SearchDeleteNccView";
    }
    @GetMapping("/manage/delete/{id}")
    public String getDelete(@PathVariable String id,Model model){
        Optional<NhaCungCap> nhaCungCap = nhaCungCapDAO.findById(Integer.parseInt(id));
        if(nhaCungCap.isEmpty()) return "NotFound"; 
        return "XoaNccView";
    }
    @PostMapping("/manage/delete/{id}")
    public String postDelete(@PathVariable String id,@ModelAttribute NhaCungCap nhaCungCap){
        nhaCungCapDAO.deleteById(Integer.parseInt(id));;
        return "redirect:/manage/delete/search";
    }
}
