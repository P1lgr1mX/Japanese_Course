package com.center.controller;

import com.center.model.KhoaHoc;
import com.center.service.KhoaHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/khoahoc")
public class KhoaHocController {

    @Autowired
    private KhoaHocService khoaHocService;

    @GetMapping
    public List<KhoaHoc> getAllKhoaHoc() {
        return khoaHocService.findAll();
    }

    @PostMapping
    public KhoaHoc createKhoaHoc(@RequestBody KhoaHoc khoaHoc) {
        return khoaHocService.save(khoaHoc);
    }

    @GetMapping("/{id}")
    public KhoaHoc getKhoaHocById(@PathVariable String id) {
        return khoaHocService.findById(id);
    }
}
