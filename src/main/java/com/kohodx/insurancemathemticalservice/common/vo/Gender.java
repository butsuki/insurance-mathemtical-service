package com.kohodx.insurancemathemticalservice.common.vo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Gender {
    male(1,"男性"),
    female(2,"女性");

    private final int genderNum;
    private final String genderName;

}
