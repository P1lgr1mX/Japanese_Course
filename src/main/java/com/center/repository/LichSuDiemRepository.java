package com.center.repository;

import com.center.model.LichSuDiem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LichSuDiemRepository extends JpaRepository<LichSuDiem, Integer> {
}
