package com.kohodx.insurancemathemticalservice.sample_syusin.service;

import org.springframework.stereotype.Service;

@Service
public class SampleSyusinCalcPremiumRateService {
    //todo ちゃんと計算する
    public long getRate(){
        return (long) Math.random();
    }
}
