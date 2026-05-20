package com.center.repository;

import com.center.model.HocVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HocVienRepository extends JpaRepository<HocVien, String> {
}
