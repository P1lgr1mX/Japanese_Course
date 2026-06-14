package com.center.service;

import com.center.model.LichSuDoiThuong;
import com.center.repository.LichSuDoiThuongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LichSuDoiThuongService {

    @Autowired
    private LichSuDoiThuongRepository lichSuDoiThuongRepository;

    public List<LichSuDoiThuong> findAll() {
        return lichSuDoiThuongRepository.findAll();
    }

    public LichSuDoiThuong save(LichSuDoiThuong lichSuDoiThuong) {
        return lichSuDoiThuongRepository.save(lichSuDoiThuong);
    }

    public LichSuDoiThuong findById(String id) {
        return lichSuDoiThuongRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        lichSuDoiThuongRepository.deleteById(id);
    }
}
