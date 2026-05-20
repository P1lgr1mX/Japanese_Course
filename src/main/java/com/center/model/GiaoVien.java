package com.center.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "GiaoVien")
@Getter
@Setter
public class GiaoVien {
    @Id
    @Column(name = "MaGV", length = 10)
    private String maGV;

    @Column(name = "HoTen", nullable = false, length = 100)
    private String hoTen;

    @Column(name = "TrinhDo", nullable = false, length = 100)
    private String trinhDo;

    @Column(name = "ChuyenMon", nullable = false, length = 100)
    private String chuyenMon;
}
