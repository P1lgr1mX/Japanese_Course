package com.center.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "LichSuDiem")
@Getter
@Setter
public class LichSuDiem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaLS")
    private Long maLS;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaHV", nullable = false)
    private HocVien hocVien;

    @Column(name = "NgayThayDoi")
    private LocalDateTime ngayThayDoi = LocalDateTime.now();

    @Column(name = "SoDiem", nullable = false, precision = 4, scale = 2)
    private BigDecimal soDiem;

    @Column(name = "LyDo", nullable = false, length = 255)
    private String lyDo;
}
