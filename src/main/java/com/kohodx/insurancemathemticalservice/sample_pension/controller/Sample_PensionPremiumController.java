package com.kohodx.insurancemathemticalservice.sample_pension.controller;

import com.kohodx.insurancemathemticalservice.common.model.CalcPremiumResponse;
import com.kohodx.insurancemathemticalservice.sample_pension.model.Sample_PensionCalcPremiumModel;
import com.kohodx.insurancemathemticalservice.sample_pension.service.Sample_PensionCalcPremiumService;
import lombok.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample_pension/")
public class Sample_PensionPremiumController {


    @GetMapping("premium")
    public CalcPremiumResponse getPremium(@NonNull @RequestBody Sample_PensionCalcPremiumModel model){

        Sample_PensionCalcPremiumService samplePensionCalcPremiumService = new Sample_PensionCalcPremiumService(model.getContractDay(), model.getPensionType(),model.getPensionPaymentPeriod(),model.getPremiumType(),model.getPremiumPaymentPeriod(),model.getDeferredPeriod(),model.getPensionAnnual(),model.getInsuredAge(),model.getInsuredGender());
        CalcPremiumResponse calcPremiumResponse = new CalcPremiumResponse();
        calcPremiumResponse.setPremium(samplePensionCalcPremiumService.getPremium());
        return calcPremiumResponse;
    }
}
