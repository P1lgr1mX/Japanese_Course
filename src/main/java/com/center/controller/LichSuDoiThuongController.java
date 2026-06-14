package com.center.controller;

import com.center.model.LichSuDoiThuong;
import com.center.service.LichSuDoiThuongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doithuong")
public class LichSuDoiThuongController {

    @Autowired
    private LichSuDoiThuongService lichSuDoiThuongService;

    @GetMapping
    public List<LichSuDoiThuong> getAllLichSuDoiThuong() {
        return lichSuDoiThuongService.findAll();
    }

    @PostMapping
    public LichSuDoiThuong createLichSuDoiThuong(@RequestBody LichSuDoiThuong lichSuDoiThuong) {
        return lichSuDoiThuongService.save(lichSuDoiThuong);
    }
}
