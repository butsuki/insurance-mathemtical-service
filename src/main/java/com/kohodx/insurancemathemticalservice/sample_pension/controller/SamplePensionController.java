package com.kohodx.insurancemathemticalservice.sample_pension.controller;

import com.kohodx.insurancemathemticalservice.common.model.CalcPremiumResponse;
import com.kohodx.insurancemathemticalservice.sample_pension.model.SamplePensionCalcPremiumModel;
import com.kohodx.insurancemathemticalservice.sample_pension.service.SamplePensionCalcPremiumService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "年金（サンプル）")
@RequestMapping("sample_pension/")
public class SamplePensionController {

    @GetMapping("premium")
    @ApiOperation("営業保険料計算")
    public CalcPremiumResponse getPremium(@NonNull @RequestBody SamplePensionCalcPremiumModel model){

        SamplePensionCalcPremiumService samplePensionCalcPremiumService = new SamplePensionCalcPremiumService(model.getContractDay(), model.getPensionType(),model.getPensionPaymentPeriod(),model.getPremiumType(),model.getPremiumPaymentPeriod(),model.getDeferredPeriod(),model.getPensionAnnual(),model.getInsuredAge(),model.getInsuredGender());
        CalcPremiumResponse calcPremiumResponse = new CalcPremiumResponse();
        calcPremiumResponse.setPremium(samplePensionCalcPremiumService.getPremium());
        return calcPremiumResponse;
    }
}
