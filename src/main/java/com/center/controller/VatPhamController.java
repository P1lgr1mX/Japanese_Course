package com.center.controller;

import com.center.model.VatPham;
import com.center.service.VatPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vatpham")
public class VatPhamController {

    @Autowired
    private VatPhamService vatPhamService;

    @GetMapping
    public List<VatPham> getAllVatPham() {
        return vatPhamService.findAll();
    }

    @PostMapping
    public VatPham createVatPham(@RequestBody VatPham vatPham) {
        return vatPhamService.save(vatPham);
    }

    @DeleteMapping("/{id}")
    public void deleteVatPham(@PathVariable String id) {
        vatPhamService.deleteById(id);
    }
}
