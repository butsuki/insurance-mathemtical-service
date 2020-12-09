package com.kohodx.insurancemathemticalservice.common.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

/** 保険料支払いタイプ。 */
@AllArgsConstructor
@Getter
public enum PremiumType {
    // 月払い。
    MONTH("月払い"),
    // 半年払い。
    HALF("半年払い"),
    // 年払い
    YEAR("年払い");

    private final String name;
}
