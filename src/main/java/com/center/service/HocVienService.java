package com.center.service;

import com.center.model.HocVien;
import com.center.repository.HocVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HocVienService {

    @Autowired
    private HocVienRepository hocVienRepository;

    public List<HocVien> findAll() {
        return hocVienRepository.findAll();
    }

    public HocVien save(HocVien hocVien) {
        return hocVienRepository.save(hocVien);
    }

    public HocVien findById(String id) {
        return hocVienRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        hocVienRepository.deleteById(id);
    }
}
