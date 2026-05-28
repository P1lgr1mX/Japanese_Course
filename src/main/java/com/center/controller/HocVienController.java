package com.center.controller;

import com.center.model.HocVien;
import com.center.repository.HocVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hocvien")
public class HocVienController {

    @Autowired
    private HocVienRepository hocVienRepository;

    @GetMapping
    public List<HocVien> getAllHocVien() {
        return hocVienRepository.findAll();
    }

    @PostMapping
    public HocVien createHocVien(@RequestBody HocVien hocVien) {
        return hocVienRepository.save(hocVien);
    }

    @GetMapping("/{id}")
    public HocVien getHocVienById(@PathVariable String id) {
        return hocVienRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public HocVien updateHocVien(@PathVariable String id, @RequestBody HocVien hocVienDetails) {
        HocVien hocVien = hocVienRepository.findById(id).orElse(null);
        if (hocVien != null) {
            hocVien.setHoTen(hocVienDetails.getHoTen());
            hocVien.setNgaySinh(hocVienDetails.getNgaySinh());
            hocVien.setEmail(hocVienDetails.getEmail());
            hocVien.setSdt(hocVienDetails.getSdt());
            hocVien.setTongDiemThuong(hocVienDetails.getTongDiemThuong());
            return hocVienRepository.save(hocVien);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteHocVien(@PathVariable String id) {
        hocVienRepository.deleteById(id);
    }
}
