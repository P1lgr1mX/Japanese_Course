package com.center.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "LichSuDoiThuong")
public class LichSuDoiThuong {
    @Id
    @Column(name = "MaGD", length = 10)
    private String maGD;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaHV", nullable = false)
    private HocVien hocVien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaVP", nullable = false)
    private VatPham vatPham;

    @Column(name = "NgayDoi")
    private LocalDateTime ngayDoi;

    @Column(name = "SoDiemDaTru", precision = 6, scale = 2)
    private BigDecimal soDiemDaTru;

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public HocVien getHocVien() {
        return hocVien;
    }

    public void setHocVien(HocVien hocVien) {
        this.hocVien = hocVien;
    }

    public VatPham getVatPham() {
        return vatPham;
    }

    public void setVatPham(VatPham vatPham) {
        this.vatPham = vatPham;
    }

    public LocalDateTime getNgayDoi() {
        return ngayDoi;
    }

    public void setNgayDoi(LocalDateTime ngayDoi) {
        this.ngayDoi = ngayDoi;
    }

    public BigDecimal getSoDiemDaTru() {
        return soDiemDaTru;
    }

    public void setSoDiemDaTru(BigDecimal soDiemDaTru) {
        this.soDiemDaTru = soDiemDaTru;
    }
}
