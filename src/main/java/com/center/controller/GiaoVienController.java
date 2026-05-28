package com.center.controller;

import com.center.model.GiaoVien;
import com.center.repository.GiaoVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/giaovien")
public class GiaoVienController {

    @Autowired
    private GiaoVienRepository giaoVienRepository;

    @GetMapping
    public List<GiaoVien> getAllGiaoVien() {
        return giaoVienRepository.findAll();
    }

    @PostMapping
    public GiaoVien createGiaoVien(@RequestBody GiaoVien giaoVien) {
        return giaoVienRepository.save(giaoVien);
    }

    @GetMapping("/{id}")
    public GiaoVien getGiaoVienById(@PathVariable String id) {
        return giaoVienRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public GiaoVien updateGiaoVien(@PathVariable String id, @RequestBody GiaoVien giaoVienDetails) {
        GiaoVien giaoVien = giaoVienRepository.findById(id).orElse(null);
        if (giaoVien != null) {
            giaoVien.setHoTen(giaoVienDetails.getHoTen());
            giaoVien.setTrinhDo(giaoVienDetails.getTrinhDo());
            giaoVien.setChuyenMon(giaoVienDetails.getChuyenMon());
            return giaoVienRepository.save(giaoVien);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteGiaoVien(@PathVariable String id) {
        giaoVienRepository.deleteById(id);
    }
}
