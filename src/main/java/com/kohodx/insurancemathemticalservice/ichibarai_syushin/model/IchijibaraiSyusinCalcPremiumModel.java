package com.kohodx.insurancemathemticalservice.ichibarai_syushin.model;

import com.kohodx.insurancemathemticalservice.common.vo.Gender;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
public class IchijibaraiSyusinCalcPremiumModel {
    // 契約年月日
    private LocalDate contractDay;
    // 被保険者年齢
    private int insuredAge;
    // 被保険者性別
    private Gender insuredGender;
    // 保険金額
    private int claim;

}
