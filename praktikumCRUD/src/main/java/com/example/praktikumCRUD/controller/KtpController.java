package com.example.praktikumCRUD.controller;

import com.example.praktikumCRUD.dto.KtpDTO;
import com.example.praktikumCRUD.service.KtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/ktp")
public class KtpController {

    @Autowired
    private KtpService service;

    // Menambah data baru menggunakan DTO
    @PostMapping
    public KtpDTO create(@Valid @RequestBody KtpDTO ktpDto) {
        return service.saveKtp(ktpDto);
    }

    // Mengambil semua data dalam bentuk List DTO
    @GetMapping
    public List<KtpDTO> getAll() {
        return service.getAllKtp();
    }

    // Mengambil data berdasarkan ID (Return DTO)
    @GetMapping("/{id}")
    public KtpDTO getById(@PathVariable Integer id) {
        return service.getKtpById(id);
    }

    // Memperbarui data (Logic pembaruan sekarang dipindah ke ServiceImpl agar Controller tetap bersih)
    @PutMapping("/{id}")
    public KtpDTO update(@PathVariable Integer id, @RequestBody KtpDTO ktpDetails) {
        // Kita set ID-nya agar ServiceImpl tahu data mana yang akan di-update
        ktpDetails.setId(id);
        return service.saveKtp(ktpDetails);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        service.deleteKtp(id);
        return "Data KTP berhasil dihapus";
    }
}