package com.center.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * <p><b>Thực thể Học Viên (Student Entity)</b></p>
 *
 * <p>Lớp này đại diện cho một học viên trong hệ thống quản lý trung tâm tiếng Nhật.
 * Nó lưu trữ các thông tin cá nhân cơ bản, thông tin liên lạc và tiến trình học tập
 * (thông qua tổng điểm thưởng).</p>
 *
 * <p><i>Các đặc điểm chính:</i></p>
 * <ul>
 *   <li>Định danh duy nhất bằng mã học viên (MaHV).</li>
 *   <li>Quản lý thông tin liên lạc bảo mật (Email, Số điện thoại).</li>
 *   <li>Theo dõi điểm thưởng tích lũy để xếp hạng học viên.</li>
 * </ul>
 *
 * @author Gemini CLI
 * @version 1.0
 * @since 2024-05-22
 */
@Entity
@Table(name = "HocVien")
public class HocVien {
    /**
     * Mã học viên - Khóa chính của bảng.
     * Thường có định dạng: HV + số thứ tự (Ví dụ: HV001).
     */
    @Id
    @Column(name = "MaHV", length = 10)
    private String maHV;

    /**
     * Họ và tên đầy đủ của học viên.
     * Trường này bắt buộc phải có (nullable = false).
     */
    @Column(name = "HoTen", nullable = false, length = 100)
    private String hoTen;

    /**
     * Ngày tháng năm sinh của học viên.
     * Sử dụng kiểu dữ liệu {@link LocalDate} để đảm bảo độ chính xác về thời gian.
     */
    @Column(name = "NgaySinh")
    private LocalDate ngaySinh;

    /**
     * Địa chỉ Email liên lạc.
     * Được dùng để đăng nhập và nhận thông báo. Mỗi email là duy nhất (unique).
     */
    @Column(name = "Email", nullable = false, unique = true, length = 100)
    private String email;

    /**
     * Số điện thoại liên lạc của học viên hoặc phụ huynh.
     */
    @Column(name = "SDT", length = 15)
    private String sdt;

    /**
     * Tổng số điểm thưởng tích lũy được từ các bài tập và hoạt động.
     * Mặc định khởi tạo là 0.
     */
    @Column(name = "TongDiemThuong", precision = 6, scale = 2)
    private BigDecimal tongDiemThuong = BigDecimal.ZERO;

    /**
     * Lấy mã học viên hiện tại.
     * @return {@code String} mã học viên.
     */
    public String getMaHV() {
        return maHV;
    }

    /**
     * Thiết lập mã học viên mới.
     * @param maHV Chuỗi mã học viên (tối đa 10 ký tự).
     */
    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    /**
     * Truy xuất họ tên của học viên.
     * @return {@code String} họ tên đầy đủ.
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * Cập nhật họ tên mới cho học viên.
     * @param hoTen Tên đầy đủ không được để trống.
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return {@link LocalDate} ngày sinh của học viên.
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * Lấy email dùng cho các dịch vụ thông báo.
     * @return {@code String} địa chỉ email.
     */
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

    /**
     * Lấy tổng điểm thưởng hiện tại.
     * @return {@link BigDecimal} số điểm thưởng.
     */
    public BigDecimal getTongDiemThuong() {
        return tongDiemThuong;
    }

    public void setTongDiemThuong(BigDecimal tongDiemThuong) {
        this.tongDiemThuong = tongDiemThuong;
    }
}
