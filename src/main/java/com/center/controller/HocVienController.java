package com.center.controller;

import com.center.model.HocVien;
import com.center.service.HocVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hocvien")
public class HocVienController {

    @Autowired
    private HocVienService hocVienService;

    @GetMapping
    public List<HocVien> getAllHocVien() {
        return hocVienService.findAll();
    }

    @PostMapping
    public HocVien createHocVien(@RequestBody HocVien hocVien) {
        return hocVienService.save(hocVien);
    }

    @GetMapping("/{id}")
    public HocVien getHocVienById(@PathVariable String id) {
        return hocVienService.findById(id);
    }

    @PutMapping("/{id}")
    public HocVien updateHocVien(@PathVariable String id, @RequestBody HocVien hocVienDetails) {
        HocVien hocVien = hocVienService.findById(id);
        if (hocVien != null) {
            hocVien.setHoTen(hocVienDetails.getHoTen());
            hocVien.setNgaySinh(hocVienDetails.getNgaySinh());
            hocVien.setEmail(hocVienDetails.getEmail());
            hocVien.setSdt(hocVienDetails.getSdt());
            hocVien.setTongDiemThuong(hocVienDetails.getTongDiemThuong());
            return hocVienService.save(hocVien);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteHocVien(@PathVariable String id) {
        hocVienService.deleteById(id);
    }
}
