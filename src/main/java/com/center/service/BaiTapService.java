package com.center.service;

import com.center.model.BaiTap;
import com.center.repository.BaiTapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaiTapService {

    @Autowired
    private BaiTapRepository baiTapRepository;

    public List<BaiTap> findAll() {
        return baiTapRepository.findAll();
    }

    public BaiTap save(BaiTap baiTap) {
        return baiTapRepository.save(baiTap);
    }

    public BaiTap findById(String id) {
        return baiTapRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        baiTapRepository.deleteById(id);
    }
}
