package com.example.praktikumCRUD.service;

import com.example.praktikumCRUD.dto.KtpDTO;
import java.util.List;

public interface KtpService {
    List<KtpDTO> getAllKtp();
    KtpDTO getKtpById(Integer id);
    KtpDTO saveKtp(KtpDTO ktpDto);
    void deleteKtp(Integer id);
}