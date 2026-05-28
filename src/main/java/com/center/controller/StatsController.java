package com.center.controller;

import com.center.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/stats")
public class StatsController {

    @Autowired private HocVienRepository hocVienRepository;
    @Autowired private GiaoVienRepository giaoVienRepository;
    @Autowired private KhoaHocRepository khoaHocRepository;
    @Autowired private LopHocRepository lopHocRepository;

    @GetMapping
    public Map<String, Long> getStats() {
        Map<String, Long> stats = new HashMap<>();
        stats.put("totalStudents", hocVienRepository.count());
        stats.put("totalTeachers", giaoVienRepository.count());
        stats.put("totalCourses", khoaHocRepository.count());
        stats.put("totalClasses", lopHocRepository.count());
        return stats;
    }
}
