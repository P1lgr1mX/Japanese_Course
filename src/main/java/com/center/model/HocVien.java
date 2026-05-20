package com.center.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "HocVien")
@Getter
@Setter
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
}
