package com.center.service;

import com.center.model.GiaoVien;
import com.center.repository.GiaoVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiaoVienService {

    @Autowired
    private GiaoVienRepository giaoVienRepository;

    public List<GiaoVien> findAll() {
        return giaoVienRepository.findAll();
    }

    public GiaoVien save(GiaoVien giaoVien) {
        return giaoVienRepository.save(giaoVien);
    }

    public GiaoVien findById(String id) {
        return giaoVienRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        giaoVienRepository.deleteById(id);
    }
}
