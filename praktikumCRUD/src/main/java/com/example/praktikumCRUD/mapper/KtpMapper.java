package com.example.praktikumCRUD.mapper;

import com.example.praktikumCRUD.dto.KtpDTO;
import com.example.praktikumCRUD.entity.Ktp;
import org.springframework.stereotype.Component;

@Component
public class KtpMapper {
    public KtpDTO toDto(Ktp entity) {
        KtpDTO dto = new KtpDTO();
        dto.setId(entity.getId());
        dto.setNomorKtp(entity.getNomorKtp());
        dto.setNamaLengkap(entity.getNamaLengkap());
        dto.setAlamat(entity.getAlamat());
        dto.setTanggalLahir(entity.getTanggalLahir());
        dto.setJenisKelamin(entity.getJenisKelamin());
        return dto;
    }

    public Ktp toEntity(KtpDTO dto) {
        Ktp entity = new Ktp();
        entity.setId(dto.getId());
        entity.setNomorKtp(dto.getNomorKtp());
        entity.setNamaLengkap(dto.getNamaLengkap());
        entity.setAlamat(dto.getAlamat());
        entity.setTanggalLahir(dto.getTanggalLahir());
        entity.setJenisKelamin(dto.getJenisKelamin());
        return entity;
    }
}