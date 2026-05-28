package com.center.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "KhoaHoc")
public class KhoaHoc {
    @Id
    @Column(name = "MaKH", length = 10)
    private String maKH;

    @Column(name = "TenKH", nullable = false, length = 100)
    private String tenKH;

    @Column(name = "CapDo", nullable = false)
    private Integer capDo;

    @Column(name = "HocPhi", nullable = false, precision = 12, scale = 2)
    private BigDecimal hocPhi;

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public Integer getCapDo() {
        return capDo;
    }

    public void setCapDo(Integer capDo) {
        this.capDo = capDo;
    }

    public BigDecimal getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(BigDecimal hocPhi) {
        this.hocPhi = hocPhi;
    }
}
