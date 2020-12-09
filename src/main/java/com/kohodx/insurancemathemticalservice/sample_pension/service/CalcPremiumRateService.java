package com.kohodx.insurancemathemticalservice.sample_pension.service;

import org.springframework.stereotype.Service;

@Service
public class CalcPremiumRateService {
    public long getRate(){
        return (long) Math.random();
    }
}
