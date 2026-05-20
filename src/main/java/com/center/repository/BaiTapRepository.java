package com.center.repository;

import com.center.model.BaiTap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaiTapRepository extends JpaRepository<BaiTap, String> {
}
