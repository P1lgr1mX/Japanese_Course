package com.center.controller;

import com.center.model.KhoaHoc;
import com.center.repository.KhoaHocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/khoahoc")
public class KhoaHocController {

    @Autowired
    private KhoaHocRepository khoaHocRepository;

    @GetMapping
    public List<KhoaHoc> getAllKhoaHoc() {
        return khoaHocRepository.findAll();
    }

    @PostMapping
    public KhoaHoc createKhoaHoc(@RequestBody KhoaHoc khoaHoc) {
        return khoaHocRepository.save(khoaHoc);
    }

    @GetMapping("/{id}")
    public KhoaHoc getKhoaHocById(@PathVariable String id) {
        return khoaHocRepository.findById(id).orElse(null);
    }
}
