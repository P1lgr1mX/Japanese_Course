package com.center.repository;

import com.center.model.LichSuDoiThuong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LichSuDoiThuongRepository extends JpaRepository<LichSuDoiThuong, String> {
}
