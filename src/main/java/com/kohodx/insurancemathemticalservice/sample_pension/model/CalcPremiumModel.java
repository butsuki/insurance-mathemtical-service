package com.kohodx.insurancemathemticalservice.sample_pension.model;

import com.kohodx.insurancemathemticalservice.common.vo.Gender;
import com.kohodx.insurancemathemticalservice.common.vo.PensionType;
import com.kohodx.insurancemathemticalservice.common.vo.PremiumType;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
public class CalcPremiumModel {
    // 年金支払いタイプ
    private String pensionType;
    // 年金支払期間
    private int pensionPaymentPeriod;
    // 保険料支払いタイプ
    private String premiumType;
    // 保険料払込期間
    private int premiumPaymentPeriod;
    // 据置期間
    private int deferredPeriod;
    // 年金支払開始日
    private LocalDate startDay;
    // 年金年額
    private int pensionAnnual;
    // 被保険者年齢
    private int insuredAge;
    // 被保険者性別
    private String insuredGender;

}
