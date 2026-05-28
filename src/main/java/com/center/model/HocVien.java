package com.center.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "HocVien")
public class HocVien {
    @Id
    @Column(name = "MaHV", length = 10)
    private String maHV;

    @Column(name = "HoTen", nullable = false, length = 100)
    private String hoTen;

    @Column(name = "NgaySinh")
    private LocalDate ngaySinh;

    @Column(name = "Email", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "SDT", length = 15)
    private String sdt;

    @Column(name = "TongDiemThuong", precision = 6, scale = 2)
    private BigDecimal tongDiemThuong = BigDecimal.ZERO;

    public String getMaHV() {
        return maHV;
    }

    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public BigDecimal getTongDiemThuong() {
        return tongDiemThuong;
    }

    public void setTongDiemThuong(BigDecimal tongDiemThuong) {
        this.tongDiemThuong = tongDiemThuong;
    }
}
