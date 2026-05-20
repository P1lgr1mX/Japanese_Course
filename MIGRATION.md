# Database Migration Steps

To set up the database for the Japanese Language Center project, follow these steps:

## 1. Prerequisites
- PostgreSQL installed and running.
- A database created (e.g., `japanese_center`).

## 2. Initial Schema Setup
Execute the [file.sql](file:///home/sanemy/pjCSDL/file.sql) script to create the tables, constraints, and relationships.

```bash
psql -U your_user -d japanese_center -f /home/sanemy/pjCSDL/file.sql
```

## 3. Backend Integration
The project is set up using **Spring Boot** with **JPA/Hibernate**.

### Configuration
Update the [application.properties](file:///home/sanemy/pjCSDL/src/main/resources/application.properties) with your database credentials.

### Entity Models
The following entity models have been generated in `src/main/java/com/center/model`:
- [KhoaHoc.java](file:///home/sanemy/pjCSDL/src/main/java/com/center/model/KhoaHoc.java)
- [GiaoVien.java](file:///home/sanemy/pjCSDL/src/main/java/com/center/model/GiaoVien.java)
- [LopHoc.java](file:///home/sanemy/pjCSDL/src/main/java/com/center/model/LopHoc.java)
- [HocVien.java](file:///home/sanemy/pjCSDL/src/main/java/com/center/model/HocVien.java)
- [BaiTap.java](file:///home/sanemy/pjCSDL/src/main/java/com/center/model/BaiTap.java)
- [LamBai.java](file:///home/sanemy/pjCSDL/src/main/java/com/center/model/LamBai.java) (Composite Primary Key)
- [LichSuDiem.java](file:///home/sanemy/pjCSDL/src/main/java/com/center/model/LichSuDiem.java)

## 4. Automated Migrations (Optional but Recommended)
For production environments, consider using **Flyway** or **Liquibase**.

### Using Flyway:
1. Move the content of `file.sql` to `src/main/resources/db/migration/V1__Initial_Schema.sql`.
2. Add the Flyway dependency to `pom.xml`.
3. Spring Boot will automatically run the migration on startup.
