package com.center.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "LopHoc")
@Getter
@Setter
public class LopHoc {
    @Id
    @Column(name = "MaLop", length = 10)
    private String maLop;

    @Column(name = "TenLop", nullable = false, length = 100)
    private String tenLop;

    @Column(name = "PhongHoc", length = 100)
    private String phongHoc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaKH", nullable = false)
    private KhoaHoc khoaHoc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaGV", nullable = false)
    private GiaoVien giaoVien;
}
