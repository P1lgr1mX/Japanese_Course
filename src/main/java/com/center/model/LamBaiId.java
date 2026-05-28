package com.center.model;

import java.io.Serializable;
import java.util.Objects;

public class LamBaiId implements Serializable {
    private String hocVien;
    private String baiTap;

    public LamBaiId() {
    }

    public LamBaiId(String hocVien, String baiTap) {
        this.hocVien = hocVien;
        this.baiTap = baiTap;
    }

    public String getHocVien() {
        return hocVien;
    }

    public void setHocVien(String hocVien) {
        this.hocVien = hocVien;
    }

    public String getBaiTap() {
        return baiTap;
    }

    public void setBaiTap(String baiTap) {
        this.baiTap = baiTap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LamBaiId lamBaiId = (LamBaiId) o;
        return Objects.equals(hocVien, lamBaiId.hocVien) && Objects.equals(baiTap, lamBaiId.baiTap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hocVien, baiTap);
    }
}
