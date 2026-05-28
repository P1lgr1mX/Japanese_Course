package com.center.model;

import jakarta.persistence.*;

@Entity
@Table(name = "GiaoVien")
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

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }
}
