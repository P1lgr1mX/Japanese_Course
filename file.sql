-- PostgreSQL DDL cho Dự án: Hệ thống Quản lý Đào tạo Trung tâm Tiếng Nhật

-- 1. Bảng KHOA_HOC (Khóa học)
CREATE TABLE KhoaHoc (
    MaKH VARCHAR(10) PRIMARY KEY,
    TenKH VARCHAR(100) NOT NULL,
    CapDo INT NOT NULL CHECK (CapDo IN (1, 2, 3)), -- 1: Cơ bản, 2: Trung cấp, 3: Nâng cao
    HocPhi NUMERIC(12, 2) NOT NULL                 -- Thay kiểu MONEY bằng NUMERIC để chuẩn Postgres
);

-- 2. Bảng GIAO_VIEN (Giáo viên)
CREATE TABLE GiaoVien (
    MaGV VARCHAR(10) PRIMARY KEY,
    HoTen VARCHAR(100) NOT NULL,                  -- Postgres dùng VARCHAR hỗ trợ UTF-8 sẵn, không cần NVARCHAR
    TrinhDo VARCHAR(100) NOT NULL,
    ChuyenMon VARCHAR(100) NOT NULL                -- Lưu N1, N2...
);

-- 3. Bảng LOP_HOC (Lớp học)
CREATE TABLE LopHoc (
    MaLop VARCHAR(10) PRIMARY KEY,
    TenLop VARCHAR(100) NOT NULL,
    PhongHoc VARCHAR(100),
    MaKH VARCHAR(10) NOT NULL,
    MaGV VARCHAR(10) NOT NULL,
    CONSTRAINT fk_lophoc_khoahoc FOREIGN KEY (MaKH) REFERENCES KhoaHoc(MaKH) ON DELETE RESTRICT,
    CONSTRAINT fk_lophoc_giaovien FOREIGN KEY (MaGV) REFERENCES GiaoVien(MaGV) ON DELETE RESTRICT
);

-- 4. Bảng HOC_VIEN (Học viên)
CREATE TABLE HocVien (
    MaHV VARCHAR(10) PRIMARY KEY,
    HoTen VARCHAR(100) NOT NULL,
    NgaySinh DATE,
    Email VARCHAR(100) NOT NULL UNIQUE,            -- Ràng buộc UNIQUE chống trùng tài khoản
    SDT VARCHAR(15),
    TongDiemThuong DECIMAL(6,2) DEFAULT 0.00       -- Tăng độ dài phần nguyên đề phòng điểm tích lũy lớn
);

-- 5. Bảng BAI_TAP (Bài tập)
CREATE TABLE BaiTap (
    MaBT VARCHAR(10) PRIMARY KEY,
    TenBT VARCHAR(100) NOT NULL,
    LoaiBT VARCHAR(100) NOT NULL,                  -- Trên lớp hoặc Online
    HanNop TIMESTAMP NOT NULL,                     -- Thay DATE bằng TIMESTAMP để tính được mốc 12:00 PM muộn/sớm
    DiemThuong DECIMAL(4,2) DEFAULT 0.00,
    DiemPhat DECIMAL(4,2) DEFAULT 0.00,
    MaLop VARCHAR(10) NOT NULL,
    CONSTRAINT fk_baitap_lophoc FOREIGN KEY (MaLop) REFERENCES LopHoc(MaLop) ON DELETE CASCADE
);

-- 6. Bảng LAM_BAI (Làm bài - Bảng trung gian Nhiều-Nhiều)
CREATE TABLE LamBai (
    MaHV VARCHAR(10),
    MaBT VARCHAR(10),
    NgayNop TIMESTAMP,                             -- Thay DATETIME bằng TIMESTAMP chuẩn Postgres
    TrangThai VARCHAR(50) NOT NULL,                -- Đã nộp, Nộp muộn, Đã chấm
    DiemNhan DECIMAL(4,2),
    PRIMARY KEY (MaHV, MaBT),
    CONSTRAINT fk_lambai_hocvien FOREIGN KEY (MaHV) REFERENCES HocVien(MaHV) ON DELETE CASCADE,
    CONSTRAINT fk_lambai_baitap FOREIGN KEY (MaBT) REFERENCES BaiTap(MaBT) ON DELETE CASCADE
);

-- 7. Bảng LICH_SU_DIEM (Lịch sử điểm)
CREATE TABLE LichSuDiem (
    MaLS SERIAL PRIMARY KEY,                       -- Dùng SERIAL để Postgres tự động tăng (Auto Increment)
    MaHV VARCHAR(10) NOT NULL,
    NgayThayDoi TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    SoDiem DECIMAL(4,2) NOT NULL,                  -- Có thể nhận giá trị âm nếu bị phạt trễ hạn
    LyDo VARCHAR(255) NOT NULL,
    CONSTRAINT fk_lichsu_hocvien FOREIGN KEY (MaHV) REFERENCES HocVien(MaHV) ON DELETE CASCADE
);