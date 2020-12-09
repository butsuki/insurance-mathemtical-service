package com.kohodx.insurancemathemticalservice.common.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PensionType {
    syusin("終身年金"),
    period("有期年金"),
    confirm("確定年金");

    private final String name;
}
