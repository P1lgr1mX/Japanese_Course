package com.center.service;

import com.center.model.DiemDanh;
import com.center.model.DiemDanhId;
import com.center.repository.DiemDanhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiemDanhService {

    @Autowired
    private DiemDanhRepository diemDanhRepository;

    public List<DiemDanh> findAll() {
        return diemDanhRepository.findAll();
    }

    public DiemDanh save(DiemDanh diemDanh) {
        return diemDanhRepository.save(diemDanh);
    }

    public DiemDanh findById(DiemDanhId id) {
        return diemDanhRepository.findById(id).orElse(null);
    }

    public void deleteById(DiemDanhId id) {
        diemDanhRepository.deleteById(id);
    }
}
