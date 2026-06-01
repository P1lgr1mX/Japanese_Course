package com.center.service;

import com.center.model.KhoaHoc;
import com.center.repository.KhoaHocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhoaHocService {

    @Autowired
    private KhoaHocRepository khoaHocRepository;

    public List<KhoaHoc> findAll() {
        return khoaHocRepository.findAll();
    }

    public KhoaHoc save(KhoaHoc khoaHoc) {
        return khoaHocRepository.save(khoaHoc);
    }

    public KhoaHoc findById(String id) {
        return khoaHocRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        khoaHocRepository.deleteById(id);
    }
}
