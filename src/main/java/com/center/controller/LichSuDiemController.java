package com.center.controller;

import com.center.model.LichSuDiem;
import com.center.service.LichSuDiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lichsudiem")
public class LichSuDiemController {

    @Autowired
    private LichSuDiemService lichSuDiemService;

    @GetMapping
    public List<LichSuDiem> getAllLichSuDiem() {
        return lichSuDiemService.findAll();
    }

    @PostMapping
    public LichSuDiem createLichSuDiem(@RequestBody LichSuDiem lichSuDiem) {
        return lichSuDiemService.save(lichSuDiem);
    }
}
