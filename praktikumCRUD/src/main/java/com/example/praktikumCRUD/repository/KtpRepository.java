package com.example.praktikumCRUD.repository;

import com.example.praktikumCRUD.entity.Ktp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KtpRepository extends JpaRepository<Ktp, Integer> {
    // Spring Data JPA otomatis menyediakan method CRUD dasar
}
