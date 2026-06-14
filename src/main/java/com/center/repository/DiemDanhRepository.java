package com.center.repository;

import com.center.model.DiemDanh;
import com.center.model.DiemDanhId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiemDanhRepository extends JpaRepository<DiemDanh, DiemDanhId> {
}
