package com.center.controller;

import com.center.model.LopHoc;
import com.center.service.LopHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lophoc")
public class LopHocController {

    @Autowired
    private LopHocService lopHocService;

    @GetMapping
    public List<LopHoc> getAllLopHoc() {
        return lopHocService.findAll();
    }

    @PostMapping
    public LopHoc createLopHoc(@RequestBody LopHoc lopHoc) {
        return lopHocService.save(lopHoc);
    }

    @GetMapping("/{id}")
    public LopHoc getLopHocById(@PathVariable String id) {
        return lopHocService.findById(id);
    }

    @PutMapping("/{id}")
    public LopHoc updateLopHoc(@PathVariable String id, @RequestBody LopHoc lopHocDetails) {
        LopHoc lopHoc = lopHocService.findById(id);
        if (lopHoc != null) {
            lopHoc.setTenLop(lopHocDetails.getTenLop());
            lopHoc.setPhongHoc(lopHocDetails.getPhongHoc());
            lopHoc.setKhoaHoc(lopHocDetails.getKhoaHoc());
            lopHoc.setGiaoVien(lopHocDetails.getGiaoVien());
            return lopHocService.save(lopHoc);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteLopHoc(@PathVariable String id) {
        lopHocService.deleteById(id);
    }
}
