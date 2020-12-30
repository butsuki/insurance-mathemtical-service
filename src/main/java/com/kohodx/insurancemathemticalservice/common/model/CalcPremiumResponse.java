package com.kohodx.insurancemathemticalservice.common.model;

import lombok.Data;

@Data
public class CalcPremiumResponse {
    private int premium;

    public static void setPremium(Object premium) {
    }
}
