package com.kohodx.insurancemathemticalservice.sample_syusin.controller;

import com.kohodx.insurancemathemticalservice.common.model.CalcPremiumResponse;
import com.kohodx.insurancemathemticalservice.sample_syusin.model.SampleSyusinCalcPremiumModel;
import com.kohodx.insurancemathemticalservice.sample_syusin.service.SampleSyusinCalcPremiumService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "終身（サンプル）")
@RequestMapping("sample_syusin/")
public class SampleSyusinController {


    @GetMapping("premium")
    @ApiOperation("営業保険料計算")
    public CalcPremiumResponse getPremium(@NonNull @RequestBody SampleSyusinCalcPremiumModel model){

        SampleSyusinCalcPremiumService sampleSyusinCalcPremiumService = new SampleSyusinCalcPremiumService(model.getContractDay(),model.getClaim(),model.getInsuredAge(),model.getInsuredGender());
        CalcPremiumResponse calcPremiumResponse = new CalcPremiumResponse();
        calcPremiumResponse.setPremium(sampleSyusinCalcPremiumService.getPremium());
        return calcPremiumResponse;
    }
}
