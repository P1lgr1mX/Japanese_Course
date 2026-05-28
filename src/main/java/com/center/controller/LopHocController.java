package com.center.controller;

import com.center.model.LopHoc;
import com.center.repository.LopHocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lophoc")
public class LopHocController {

    @Autowired
    private LopHocRepository lopHocRepository;

    @GetMapping
    public List<LopHoc> getAllLopHoc() {
        return lopHocRepository.findAll();
    }

    @PostMapping
    public LopHoc createLopHoc(@RequestBody LopHoc lopHoc) {
        return lopHocRepository.save(lopHoc);
    }

    @GetMapping("/{id}")
    public LopHoc getLopHocById(@PathVariable String id) {
        return lopHocRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public LopHoc updateLopHoc(@PathVariable String id, @RequestBody LopHoc lopHocDetails) {
        LopHoc lopHoc = lopHocRepository.findById(id).orElse(null);
        if (lopHoc != null) {
            lopHoc.setTenLop(lopHocDetails.getTenLop());
            lopHoc.setPhongHoc(lopHocDetails.getPhongHoc());
            lopHoc.setKhoaHoc(lopHocDetails.getKhoaHoc());
            lopHoc.setGiaoVien(lopHocDetails.getGiaoVien());
            return lopHocRepository.save(lopHoc);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteLopHoc(@PathVariable String id) {
        lopHocRepository.deleteById(id);
    }
}
