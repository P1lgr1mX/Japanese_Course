package com.center.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "VatPham")
public class VatPham {
    @Id
    @Column(name = "MaVP", length = 10)
    private String maVP;

    @Column(name = "TenVP", nullable = false, length = 100)
    private String tenVP;

    @Column(name = "SoDiemQuyDoi", precision = 6, scale = 2)
    private BigDecimal soDiemQuyDoi;

    @Column(name = "SoLuongTonKho")
    private Integer soLuongTonKho;

    public String getMaVP() {
        return maVP;
    }

    public void setMaVP(String maVP) {
        this.maVP = maVP;
    }

    public String getTenVP() {
        return tenVP;
    }

    public void setTenVP(String tenVP) {
        this.tenVP = tenVP;
    }

    public BigDecimal getSoDiemQuyDoi() {
        return soDiemQuyDoi;
    }

    public void setSoDiemQuyDoi(BigDecimal soDiemQuyDoi) {
        this.soDiemQuyDoi = soDiemQuyDoi;
    }

    public Integer getSoLuongTonKho() {
        return soLuongTonKho;
    }

    public void setSoLuongTonKho(Integer soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
    }
}
