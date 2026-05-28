package com.center.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "BaiTap")
public class BaiTap {
    @Id
    @Column(name = "MaBT", length = 10)
    private String maBT;

    @Column(name = "TenBT", nullable = false, length = 100)
    private String tenBT;

    @Column(name = "LoaiBT", nullable = false, length = 100)
    private String loaiBT;

    @Column(name = "HanNop", nullable = false)
    private LocalDateTime hanNop;

    @Column(name = "DiemThuong", precision = 4, scale = 2)
    private BigDecimal diemThuong = BigDecimal.ZERO;

    @Column(name = "DiemPhat", precision = 4, scale = 2)
    private BigDecimal diemPhat = BigDecimal.ZERO;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaLop", nullable = false)
    private LopHoc lopHoc;

    public String getMaBT() {
        return maBT;
    }

    public void setMaBT(String maBT) {
        this.maBT = maBT;
    }

    public String getTenBT() {
        return tenBT;
    }

    public void setTenBT(String tenBT) {
        this.tenBT = tenBT;
    }

    public String getLoaiBT() {
        return loaiBT;
    }

    public void setLoaiBT(String loaiBT) {
        this.loaiBT = loaiBT;
    }

    public LocalDateTime getHanNop() {
        return hanNop;
    }

    public void setHanNop(LocalDateTime hanNop) {
        this.hanNop = hanNop;
    }

    public BigDecimal getDiemThuong() {
        return diemThuong;
    }

    public void setDiemThuong(BigDecimal diemThuong) {
        this.diemThuong = diemThuong;
    }

    public BigDecimal getDiemPhat() {
        return diemPhat;
    }

    public void setDiemPhat(BigDecimal diemPhat) {
        this.diemPhat = diemPhat;
    }

    public LopHoc getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(LopHoc lopHoc) {
        this.lopHoc = lopHoc;
    }
}
