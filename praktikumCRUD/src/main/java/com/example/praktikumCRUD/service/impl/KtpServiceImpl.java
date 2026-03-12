package com.example.praktikumCRUD.service.impl;

import com.example.praktikumCRUD.dto.KtpDTO;
import com.example.praktikumCRUD.entity.Ktp;
import com.example.praktikumCRUD.mapper.KtpMapper;
import com.example.praktikumCRUD.repository.KtpRepository;
import com.example.praktikumCRUD.service.KtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class KtpServiceImpl implements KtpService {
    @Autowired private KtpRepository repository;
    @Autowired private KtpMapper mapper;

    @Override
    public List<KtpDTO> getAllKtp() {
        return repository.findAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @Override
    public KtpDTO getKtpById(Integer id) {
        Ktp ktp = repository.findById(id).orElseThrow(() -> new RuntimeException("Data tidak ditemukan"));
        return mapper.toDto(ktp);
    }

    @Override
    public KtpDTO saveKtp(KtpDTO ktpDto) {
        Ktp ktp = mapper.toEntity(ktpDto);
        return mapper.toDto(repository.save(ktp));
    }

    @Override
    public void deleteKtp(Integer id) { repository.deleteById(id); }
}