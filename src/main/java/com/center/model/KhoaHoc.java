package com.center.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Entity
@Table(name = "KhoaHoc")
@Getter
@Setter
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
}
