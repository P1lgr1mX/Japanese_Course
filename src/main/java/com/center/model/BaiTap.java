package com.center.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "BaiTap")
@Getter
@Setter
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
}
