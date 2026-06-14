package com.center.controller;

import com.center.model.HoaDon;
import com.center.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hoadon")
public class HoaDonController {

    @Autowired
    private HoaDonService hoaDonService;

    @GetMapping
    public List<HoaDon> getAllHoaDon() {
        return hoaDonService.findAll();
    }

    @PostMapping
    public HoaDon createHoaDon(@RequestBody HoaDon hoaDon) {
        return hoaDonService.save(hoaDon);
    }

    @DeleteMapping("/{id}")
    public void deleteHoaDon(@PathVariable String id) {
        hoaDonService.deleteById(id);
    }
}
