package com.kohodx.insurancemathemticalservice.ichibarai_syushin.controller;

import com.kohodx.insurancemathemticalservice.common.model.CalcPremiumResponse;
import com.kohodx.insurancemathemticalservice.ichibarai_syushin.model.IchijibaraiSyusinCalcPremiumModel;
import com.kohodx.insurancemathemticalservice.ichibarai_syushin.service.Ichibarai_SyusinCalcPremiumService;
import com.kohodx.insurancemathemticalservice.sample_pension.model.SamplePensionCalcPremiumModel;
import com.kohodx.insurancemathemticalservice.sample_syusin.service.SampleSyusinCalcPremiumService;
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

    @GetMapping("Premium")
    @ApiOperation("営業保険料計算")

   public CalcPremiumResponse calcPremium(@NonNull @RequestBody IchijibaraiSyusinCalcPremiumModel model, Object Premium){

        //serviceをnew(constructor呼び出し)
        Ichibarai_SyusinCalcPremiumService ichibarai_SyusinCalcPremiumService = new Ichibarai_SyusinCalcPremiumService(model.getInsuredS(),model.getInsuredAge(),model.getInsuredGender());
        //responseをnew
        CalcPremiumResponse calcPremiumResponse = new CalcPremiumResponse();
        //responseにpremiumをset（newしたserviceで）
        calcPremiumResponse.setPremium(ichibarai_SyusinCalcPremiumService.getPremium());

        return calcPremiumResponse;
    }

}
