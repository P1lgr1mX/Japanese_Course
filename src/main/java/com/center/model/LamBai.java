package com.center.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "LamBai")
@IdClass(LamBaiId.class)
@Getter
@Setter
public class LamBai {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaHV", nullable = false)
    private HocVien hocVien;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaBT", nullable = false)
    private BaiTap baiTap;

    @Column(name = "NgayNop")
    private LocalDateTime ngayNop;

    @Column(name = "TrangThai", nullable = false, length = 50)
    private String trangThai;

    @Column(name = "DiemNhan", precision = 4, scale = 2)
    private BigDecimal diemNhan;
}
