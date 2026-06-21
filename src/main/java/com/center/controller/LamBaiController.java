package com.center.controller;

import com.center.model.LamBai;
import com.center.model.LamBaiId;
import com.center.service.LamBaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lambai")
public class LamBaiController {

    @Autowired
    private LamBaiService lamBaiService;

    @GetMapping
    public List<LamBai> getAllLamBai() {
        return lamBaiService.findAll();
    }

    @PostMapping
    public LamBai createLamBai(@RequestBody LamBai lamBai) {
        return lamBaiService.save(lamBai);
    }

    @DeleteMapping
    public void deleteLamBai(@RequestBody LamBaiId id) {
        lamBaiService.deleteById(id);
    }
}
