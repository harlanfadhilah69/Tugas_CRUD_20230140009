package com.example.praktikumCRUD.util;

import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class DateUtil {

    // Mengubah LocalDate menjadi string format Indonesia (dd-MM-yyyy)
    public String formatIndonesianDate(LocalDate date) {
        if (date == null) return "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        return date.format(formatter);
    }
}