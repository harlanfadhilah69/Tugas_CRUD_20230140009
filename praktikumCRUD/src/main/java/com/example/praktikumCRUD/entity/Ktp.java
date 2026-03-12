package com.example.praktikumCRUD.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "ktp")
public class Ktp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    @NotBlank(message = "Nomor KTP wajib diisi")
    private String nomorKtp;

    @NotBlank(message = "Nama lengkap wajib diisi")
    private String namaLengkap;

    private String alamat;
    private LocalDate tanggalLahir;
    private String jenisKelamin;
}
