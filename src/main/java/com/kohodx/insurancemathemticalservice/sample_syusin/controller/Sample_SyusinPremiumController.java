package com.kohodx.insurancemathemticalservice.sample_syusin.controller;

import com.kohodx.insurancemathemticalservice.common.model.CalcPremiumResponse;
import com.kohodx.insurancemathemticalservice.sample_syusin.model.Sample_SyusinCalcPremiumModel;
import com.kohodx.insurancemathemticalservice.sample_syusin.service.Sample_SyusinCalcPremiumService;
import lombok.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample_syusin/")
public class Sample_SyusinPremiumController {


    @GetMapping("premium")
    public CalcPremiumResponse getPremium(@NonNull @RequestBody Sample_SyusinCalcPremiumModel model){

        Sample_SyusinCalcPremiumService sampleSyusinCalcPremiumService = new Sample_SyusinCalcPremiumService(model.getContractDay(),model.getClaim(),model.getInsuredAge(),model.getInsuredGender());
        CalcPremiumResponse calcPremiumResponse = new CalcPremiumResponse();
        calcPremiumResponse.setPremium(sampleSyusinCalcPremiumService.getPremium());
        return calcPremiumResponse;
    }
}
