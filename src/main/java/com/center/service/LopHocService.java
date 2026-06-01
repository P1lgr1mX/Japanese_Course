package com.center.service;

import com.center.model.LopHoc;
import com.center.repository.LopHocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LopHocService {

    @Autowired
    private LopHocRepository lopHocRepository;

    public List<LopHoc> findAll() {
        return lopHocRepository.findAll();
    }

    public LopHoc save(LopHoc lopHoc) {
        return lopHocRepository.save(lopHoc);
    }

    public LopHoc findById(String id) {
        return lopHocRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        lopHocRepository.deleteById(id);
    }
}
