package com.center.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "DiemDanh")
@IdClass(DiemDanhId.class)
public class DiemDanh {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaHV", nullable = false)
    private HocVien hocVien;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaLop", nullable = false)
    private LopHoc lopHoc;

    @Id
    @Column(name = "NgayHoc", nullable = false)
    private LocalDate ngayHoc;

    @Column(name = "TrangThai", nullable = false, length = 50)
    private String trangThai;

    @Column(name = "GhiChu", length = 255)
    private String ghiChu;

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

    public LocalDate getNgayHoc() {
        return ngayHoc;
    }

    public void setNgayHoc(LocalDate ngayHoc) {
        this.ngayHoc = ngayHoc;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
