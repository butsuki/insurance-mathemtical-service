package com.kohodx.insurancemathemticalservice.ichibarai_syushin.service;

import com.kohodx.insurancemathemticalservice.common.vo.Gender;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

@Data
public class SampleSyusinCalcPremiumService {

    @Autowired
    SampleSyusinCalcPremiumRateService sampleSyusinCalcPremiumRateService;

    // 保険金（万単位）
    private int insuredS;
    // 被保険者年齢
    private int insuredAge;
    private int Age;
    // 被保険者性別
    private Gender insuredGender;
    //保険料
    private int premium;

    public SampleSyusinCalcPremiumService(int insuredS, int claim, int insuredAge, Gender insuredGender){
        this.insuredS = insuredS;
        this.insuredAge = insuredAge;
        this.insuredGender = insuredGender;
        this.claim = claim;

        //保険料計算　107歳時一時払いを全額とし割引計算
        if(Gender = "famale"){
            Age = insuredAge - 5;
        } else {
            Age = insuredAge;
        }
        this.premium = insuredS * ((107 - Age) / 100 + 1) * 10000;
        // this.premium = (int) (claim * sampleSyusinCalcPremiumRateService.getRate());
    }
}
