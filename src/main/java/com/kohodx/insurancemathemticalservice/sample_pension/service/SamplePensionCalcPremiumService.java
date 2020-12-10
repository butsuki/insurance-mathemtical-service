package com.kohodx.insurancemathemticalservice.sample_pension.service;

import com.kohodx.insurancemathemticalservice.common.vo.Gender;
import com.kohodx.insurancemathemticalservice.common.vo.PensionType;
import com.kohodx.insurancemathemticalservice.common.vo.PremiumType;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

@Data
public class SamplePensionCalcPremiumService {

    @Autowired
    SamplePensionCalcPremiumRateService samplePensionCalcPremiumRateService;

    // 契約年月日
    private LocalDate contractDay;
    // 年金支払いタイプ
    private PensionType pensionType;
    // 年金支払期間
    private int pensionPaymentPeriod;
    // 保険料支払いタイプ
    private PremiumType premiumType;
    // 保険料払込期間
    private int premiumPaymentPeriod;
    // 据置期間
    private int deferredPeriod;
    // 年金受取人
    private String receiverNum;
    // 年金年額
    private long pensionAnnual;
    // 被保険者年齢
    private int insuredAge;
    // 被保険者性別
    private Gender insuredGender;

    //保険料
    private int premium;

    public SamplePensionCalcPremiumService(LocalDate contractDay, PensionType pensionType, int pensionPaymentPeriod, PremiumType premiumType, int premiumPaymentPeriod, int deferredPeriod, int pensionAnnual, int insuredAge, Gender insuredGender){
        this.contractDay = contractDay;
        this.pensionType = pensionType;
        this.pensionPaymentPeriod = pensionPaymentPeriod;
        this.premiumType = premiumType;
        this.premiumPaymentPeriod = premiumPaymentPeriod;
        this.deferredPeriod = deferredPeriod;
        this.pensionAnnual = pensionAnnual;
        this.insuredAge = insuredAge;
        this.insuredGender = insuredGender;

        //todo 年齢範囲チェックを別に作って呼ぶ
        //todo ちゃんと計算する
        this.premium = (int) (pensionAnnual * samplePensionCalcPremiumRateService.getRate());
    }
}
