package com.center.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "LichSuDiem")
public class LichSuDiem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaLS")
    private Long maLS;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaHV", nullable = false)
    private HocVien hocVien;

    @Column(name = "NgayThayDoi")
    private LocalDateTime ngayThayDoi = LocalDateTime.now();

    @Column(name = "SoDiem", nullable = false, precision = 4, scale = 2)
    private BigDecimal soDiem;

    @Column(name = "LyDo", nullable = false, length = 255)
    private String lyDo;

    public Long getMaLS() {
        return maLS;
    }

    public void setMaLS(Long maLS) {
        this.maLS = maLS;
    }

    public HocVien getHocVien() {
        return hocVien;
    }

    public void setHocVien(HocVien hocVien) {
        this.hocVien = hocVien;
    }

    public LocalDateTime getNgayThayDoi() {
        return ngayThayDoi;
    }

    public void setNgayThayDoi(LocalDateTime ngayThayDoi) {
        this.ngayThayDoi = ngayThayDoi;
    }

    public BigDecimal getSoDiem() {
        return soDiem;
    }

    public void setSoDiem(BigDecimal soDiem) {
        this.soDiem = soDiem;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }
}
