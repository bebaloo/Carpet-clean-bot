package com.example.carpetcleanbot.model.enums;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum CarpetType {
    FINE_SYNTHETIC(100d, "Тонка синтетика"), // Тонка синтетика
    LONG_PAIR(130d, "Довгий ворс"), // Довгий ворс
    WOOL(100d, "Вовна"), // Вовна
    CARPET(85d, "Ковролін"), // Ковролін
    THIN(85d, "Тонкий килим"), // Тонкий килим
    THICK(120d, "Товстий килим"), // Товстий килим
    SILK(150d, "Шовковий"), // Шовковий
    ACRYLIC(130d, "Акриловий"), // Акриловий
    VISCOSE(150d, "Віскозний"), // Віскозний
    JALOUSIE(60d, "Жалюзі"); // Жалюзі

    private final Double price;
    private final String name;
}
