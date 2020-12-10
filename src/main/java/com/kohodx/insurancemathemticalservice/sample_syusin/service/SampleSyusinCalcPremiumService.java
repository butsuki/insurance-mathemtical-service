package com.kohodx.insurancemathemticalservice.sample_syusin.service;

import com.kohodx.insurancemathemticalservice.common.vo.Gender;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

@Data
public class SampleSyusinCalcPremiumService {

    @Autowired
    SampleSyusinCalcPremiumRateService sampleSyusinCalcPremiumRateService;

    // 契約年月日
    private LocalDate contractDay;
    // 年金年額
    private long claim;
    // 被保険者年齢
    private int insuredAge;
    // 被保険者性別
    private Gender insuredGender;

    //保険料
    private int premium;

    public SampleSyusinCalcPremiumService(LocalDate contractDay, int claim, int insuredAge, Gender insuredGender){
        this.contractDay = contractDay;
        this.insuredAge = insuredAge;
        this.insuredGender = insuredGender;
        this.claim = claim;

        //todo 年齢範囲チェックを別に作って呼ぶ
        //todo ちゃんと計算する
        this.premium = (int) (claim * sampleSyusinCalcPremiumRateService.getRate());
    }
}
