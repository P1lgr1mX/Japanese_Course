package com.center.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class DiemDanhId implements Serializable {
    private String hocVien;
    private String lopHoc;
    private LocalDate ngayHoc;

    public DiemDanhId() {
    }

    public DiemDanhId(String hocVien, String lopHoc, LocalDate ngayHoc) {
        this.hocVien = hocVien;
        this.lopHoc = lopHoc;
        this.ngayHoc = ngayHoc;
    }

    public String getHocVien() {
        return hocVien;
    }

    public void setHocVien(String hocVien) {
        this.hocVien = hocVien;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    public LocalDate getNgayHoc() {
        return ngayHoc;
    }

    public void setNgayHoc(LocalDate ngayHoc) {
        this.ngayHoc = ngayHoc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiemDanhId that = (DiemDanhId) o;
        return Objects.equals(hocVien, that.hocVien) && 
               Objects.equals(lopHoc, that.lopHoc) && 
               Objects.equals(ngayHoc, that.ngayHoc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hocVien, lopHoc, ngayHoc);
    }
}
