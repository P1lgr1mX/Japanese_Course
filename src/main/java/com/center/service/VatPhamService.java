package com.center.service;

import com.center.model.VatPham;
import com.center.repository.VatPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VatPhamService {

    @Autowired
    private VatPhamRepository vatPhamRepository;

    public List<VatPham> findAll() {
        return vatPhamRepository.findAll();
    }

    public VatPham save(VatPham vatPham) {
        return vatPhamRepository.save(vatPham);
    }

    public VatPham findById(String id) {
        return vatPhamRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        vatPhamRepository.deleteById(id);
    }
}
