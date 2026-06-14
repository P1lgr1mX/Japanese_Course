package com.center.controller;

import com.center.model.DiemDanh;
import com.center.service.DiemDanhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diemdanh")
public class DiemDanhController {

    @Autowired
    private DiemDanhService diemDanhService;

    @GetMapping
    public List<DiemDanh> getAllDiemDanh() {
        return diemDanhService.findAll();
    }

    @PostMapping
    public DiemDanh createDiemDanh(@RequestBody DiemDanh diemDanh) {
        return diemDanhService.save(diemDanh);
    }
}
