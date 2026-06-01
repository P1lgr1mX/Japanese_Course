package com.center.controller;

import com.center.model.GiaoVien;
import com.center.service.GiaoVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/giaovien")
public class GiaoVienController {

    @Autowired
    private GiaoVienService giaoVienService;

    @GetMapping
    public List<GiaoVien> getAllGiaoVien() {
        return giaoVienService.findAll();
    }

    @PostMapping
    public GiaoVien createGiaoVien(@RequestBody GiaoVien giaoVien) {
        return giaoVienService.save(giaoVien);
    }

    @GetMapping("/{id}")
    public GiaoVien getGiaoVienById(@PathVariable String id) {
        return giaoVienService.findById(id);
    }

    @PutMapping("/{id}")
    public GiaoVien updateGiaoVien(@PathVariable String id, @RequestBody GiaoVien giaoVienDetails) {
        GiaoVien giaoVien = giaoVienService.findById(id);
        if (giaoVien != null) {
            giaoVien.setHoTen(giaoVienDetails.getHoTen());
            giaoVien.setTrinhDo(giaoVienDetails.getTrinhDo());
            giaoVien.setChuyenMon(giaoVienDetails.getChuyenMon());
            return giaoVienService.save(giaoVien);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteGiaoVien(@PathVariable String id) {
        giaoVienService.deleteById(id);
    }
}
