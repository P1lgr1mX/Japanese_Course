package com.center.repository;

import com.center.model.VatPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VatPhamRepository extends JpaRepository<VatPham, String> {
}
