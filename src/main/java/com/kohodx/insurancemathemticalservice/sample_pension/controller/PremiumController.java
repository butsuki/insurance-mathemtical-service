package com.kohodx.insurancemathemticalservice.sample_pension.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample_pension/")
public class PremiumController {

    @RequestMapping("premium")
    public int getPremium(){
        return 9999;
    }
}
