package com.center.service;

import com.center.model.LamBai;
import com.center.model.LamBaiId;
import com.center.repository.LamBaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LamBaiService {

    @Autowired
    private LamBaiRepository lamBaiRepository;

    public List<LamBai> findAll() {
        return lamBaiRepository.findAll();
    }

    public LamBai save(LamBai lamBai) {
        return lamBaiRepository.save(lamBai);
    }

    public LamBai findById(LamBaiId id) {
        return lamBaiRepository.findById(id).orElse(null);
    }

    public void deleteById(LamBaiId id) {
        lamBaiRepository.deleteById(id);
    }
}
