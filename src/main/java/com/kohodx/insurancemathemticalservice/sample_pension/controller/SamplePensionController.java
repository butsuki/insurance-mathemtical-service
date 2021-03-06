package com.kohodx.insurancemathemticalservice.sample_pension.controller;

import com.kohodx.insurancemathemticalservice.common.model.CalcCancellationRefundResponse;
import com.kohodx.insurancemathemticalservice.common.model.CalcPolicyReserveResponse;
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
    public CalcPremiumResponse calcPremium(@NonNull @RequestBody SamplePensionCalcPremiumModel model){

        SamplePensionCalcPremiumService samplePensionCalcPremiumService = new SamplePensionCalcPremiumService(model.getContractDay(), model.getPensionType(),model.getPensionPaymentPeriod(),model.getPremiumType(),model.getPremiumPaymentPeriod(),model.getDeferredPeriod(),model.getPensionAnnual(),model.getInsuredAge(),model.getInsuredGender());
        CalcPremiumResponse calcPremiumResponse = new CalcPremiumResponse();
        calcPremiumResponse.setPremium(samplePensionCalcPremiumService.getPremium());
        return calcPremiumResponse;
    }

    @GetMapping("policyreserve")
    @ApiOperation("責任準備金計算")
    //todo requestBodyの追加
    public CalcPolicyReserveResponse calcPolicyReserve(){
        //todo constructor呼び出し
        CalcPolicyReserveResponse calcPolicyReserveResponse = new CalcPolicyReserveResponse();
        //todo 計算呼び出しなど
        calcPolicyReserveResponse.setPolicyReserve(10000);
        return calcPolicyReserveResponse;
    }

    @GetMapping("cancellationrefund")
    @ApiOperation("解約返戻金計算")
    //todo requestBodyの追加
    public CalcCancellationRefundResponse calcCancellationRefund(){
        //todo constructor呼び出し
        CalcCancellationRefundResponse calcCancellationRefundResponse = new CalcCancellationRefundResponse();
        //todo 計算呼び出しなど
        calcCancellationRefundResponse.setCancellationRefund(10000);
        return calcCancellationRefundResponse;
    }
}
