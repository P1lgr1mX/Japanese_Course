# 🌸 Japanese Language Center Management System

Hệ thống quản lý đào tạo hiện đại dành cho Trung tâm Tiếng Nhật, được xây dựng trên nền tảng **Spring Boot** và **PostgreSQL**.

---

### 🚀 Tính năng nổi bật
- **Quản lý Khóa học**: Theo dõi lộ trình từ N5 đến N1.
- **Quản lý Đào tạo**: Gắn kết Giáo viên, Lớp học và Học viên.
- **Hệ thống Điểm thưởng**: Tích lũy điểm thông qua bài tập và chuyên cần.
- **RESTful API**: Dễ dàng tích hợp với các ứng dụng Frontend hiện đại.

### 🛠️ Công nghệ sử dụng
- **Backend**: Java 17, Spring Boot 3.2.5, Spring Data JPA.
- **Database**: PostgreSQL.
- **Tiện ích**: Lombok, Maven.
- **Frontend**: HTML5, Bootstrap 5 (Giao diện Admin cơ bản).

### 📦 Cài đặt nhanh
1. **Database**: Tạo database `japanese_center` trong PostgreSQL.
2. **Cấu hình**: Cập nhật thông tin kết nối trong `src/main/resources/application.properties`.
3. **Chạy ứng dụng**:
   ```bash
   mvn spring-boot:run
   ```
4. **Truy cập**:
   - Website: `http://localhost:8080`
   - API Khóa học: `http://localhost:8080/api/khoahoc`

### 📂 Cấu trúc dự án chính
- `com.center.model`: Các thực thể database (Entities).
- `com.center.repository`: Lớp truy vấn dữ liệu (JPA Repositories).
- `com.center.controller`: Các đầu cuối API (REST Controllers).

---
*Made with ❤️ for Japanese Language Centers.*
