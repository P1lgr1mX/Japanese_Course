package com.center.service;

import com.center.model.HoaDon;
import com.center.repository.HoaDonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoaDonService {

    @Autowired
    private HoaDonRepository hoaDonRepository;

    public List<HoaDon> findAll() {
        return hoaDonRepository.findAll();
    }

    public HoaDon save(HoaDon hoaDon) {
        return hoaDonRepository.save(hoaDon);
    }

    public HoaDon findById(String id) {
        return hoaDonRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        hoaDonRepository.deleteById(id);
    }
}
