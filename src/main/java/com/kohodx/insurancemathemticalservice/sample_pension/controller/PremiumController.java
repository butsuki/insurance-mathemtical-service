package com.kohodx.insurancemathemticalservice.sample_pension.controller;

import com.kohodx.insurancemathemticalservice.common.model.CalcPremiumResponse;
import com.kohodx.insurancemathemticalservice.sample_pension.model.CalcPremiumModel;
import com.kohodx.insurancemathemticalservice.sample_pension.service.CalcPremiumService;
import lombok.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample_pension/")
public class PremiumController {


    @GetMapping("premium")
    public CalcPremiumResponse getPremium(@NonNull @RequestBody CalcPremiumModel model){

        CalcPremiumService calcPremiumService = new CalcPremiumService(model.getContractDay(), model.getPensionType(),model.getPensionPaymentPeriod(),model.getPremiumType(),model.getPremiumPaymentPeriod(),model.getDeferredPeriod(),model.getPensionAnnual(),model.getInsuredAge(),model.getInsuredGender());
        CalcPremiumResponse calcPremiumResponse = new CalcPremiumResponse();
        calcPremiumResponse.setPremium(calcPremiumService.getPremium());
        return calcPremiumResponse;
    }
}
