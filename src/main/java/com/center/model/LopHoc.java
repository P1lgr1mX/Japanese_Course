package com.center.model;

import jakarta.persistence.*;

@Entity
@Table(name = "LopHoc")
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

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }

    public KhoaHoc getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(KhoaHoc khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public GiaoVien getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(GiaoVien giaoVien) {
        this.giaoVien = giaoVien;
    }
}
