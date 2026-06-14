package com.center.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "HoaDon")
public class HoaDon {
    @Id
    @Column(name = "MaHD", length = 10)
    private String maHD;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaHV", nullable = false)
    private HocVien hocVien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaLop", nullable = false)
    private LopHoc lopHoc;

    @Column(name = "SoTienPhaiDong", precision = 12, scale = 2)
    private BigDecimal soTienPhaiDong;

    @Column(name = "SoTienDaDong", precision = 12, scale = 2)
    private BigDecimal soTienDaDong;

    @Column(name = "NgayThanhToan")
    private LocalDate ngayThanhToan;

    @Column(name = "TrangThai", length = 50)
    private String trangThai;

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public HocVien getHocVien() {
        return hocVien;
    }

    public void setHocVien(HocVien hocVien) {
        this.hocVien = hocVien;
    }

    public LopHoc getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(LopHoc lopHoc) {
        this.lopHoc = lopHoc;
    }

    public BigDecimal getSoTienPhaiDong() {
        return soTienPhaiDong;
    }

    public void setSoTienPhaiDong(BigDecimal soTienPhaiDong) {
        this.soTienPhaiDong = soTienPhaiDong;
    }

    public BigDecimal getSoTienDaDong() {
        return soTienDaDong;
    }

    public void setSoTienDaDong(BigDecimal soTienDaDong) {
        this.soTienDaDong = soTienDaDong;
    }

    public LocalDate getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(LocalDate ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
