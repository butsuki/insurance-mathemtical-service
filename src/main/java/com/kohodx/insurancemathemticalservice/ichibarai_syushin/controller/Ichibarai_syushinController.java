package com.kohodx.insurancemathemticalservice.ichibarai_syushin.controller;

import com.kohodx.insurancemathemticalservice.common.model.CalcPremiumResponse;
<<<<<<< HEAD
import com.kohodx.insurancemathemticalservice.common.vo.Gender;
=======
>>>>>>> origin/team1_branch
import com.kohodx.insurancemathemticalservice.ichibarai_syushin.service.Ichibarai_SyusinCalcPremiumService;
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
@Api(tags = "終身保険（一時払い）")
@RequestMapping("ichijibarai_syushin/")

public class Ichibarai_syushinController {

    @GetMapping("premium")
    @ApiOperation("営業保険料計算")
<<<<<<< HEAD


    public CalcPremiumResponse calcPremium(@NonNull @RequestBody SamplePensionCalcPremiumModel model){

        CalcPremiumResponse calcPremiumResponse = new CalcPremiumResponse();
        calcPremiumResponse.setPremium(Ichibarai_SyusinCalcPremiumService.getPremium());
=======
    public CalcPremiumResponse calcPremium(@NonNull @RequestBody SamplePensionCalcPremiumModel model){

        CalcPremiumResponse calcPremiumResponse = new CalcPremiumResponse();
        //calcPremiumResponse.setPremium(10000);
        calcPremiumResponse.setPremium(Premium);
>>>>>>> origin/team1_branch
        return calcPremiumResponse;
    }

}