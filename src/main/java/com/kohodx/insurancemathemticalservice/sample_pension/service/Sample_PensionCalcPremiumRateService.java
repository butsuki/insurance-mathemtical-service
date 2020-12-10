package com.kohodx.insurancemathemticalservice.sample_pension.service;

import org.springframework.stereotype.Service;

@Service
public class Sample_PensionCalcPremiumRateService {
    //todo ちゃんと計算する
    public long getRate(){
        return (long) Math.random();
    }
}
