package com.center.service;

import com.center.model.LichSuDiem;
import com.center.repository.LichSuDiemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LichSuDiemService {

    @Autowired
    private LichSuDiemRepository lichSuDiemRepository;

    public List<LichSuDiem> findAll() {
        return lichSuDiemRepository.findAll();
    }

    public LichSuDiem save(LichSuDiem lichSuDiem) {
        return lichSuDiemRepository.save(lichSuDiem);
    }
}
