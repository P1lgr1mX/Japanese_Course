package com.center.repository;

import com.center.model.LamBai;
import com.center.model.LamBaiId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LamBaiRepository extends JpaRepository<LamBai, LamBaiId> {
}
