package com.center.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "LamBai")
@IdClass(LamBaiId.class)
public class LamBai {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaHV", nullable = false)
    private HocVien hocVien;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaBT", nullable = false)
    private BaiTap baiTap;

    @Column(name = "NgayNop")
    private LocalDateTime ngayNop;

    @Column(name = "TrangThai", nullable = false, length = 50)
    private String trangThai;

    @Column(name = "DiemNhan", precision = 4, scale = 2)
    private BigDecimal diemNhan;

    public HocVien getHocVien() {
        return hocVien;
    }

    public void setHocVien(HocVien hocVien) {
        this.hocVien = hocVien;
    }

    public BaiTap getBaiTap() {
        return baiTap;
    }

    public void setBaiTap(BaiTap baiTap) {
        this.baiTap = baiTap;
    }

    public LocalDateTime getNgayNop() {
        return ngayNop;
    }

    public void setNgayNop(LocalDateTime ngayNop) {
        this.ngayNop = ngayNop;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public BigDecimal getDiemNhan() {
        return diemNhan;
    }

    public void setDiemNhan(BigDecimal diemNhan) {
        this.diemNhan = diemNhan;
    }
}
