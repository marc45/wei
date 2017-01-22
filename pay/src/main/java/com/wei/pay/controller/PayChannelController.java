package com.wei.pay.controller;

import com.wei.common.domain.CommonResponse;
import com.wei.pay.domain.PayChannel;
import com.wei.pay.service.PayChannelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/pay/channel")
public class PayChannelController {

    private static final Logger LOG = LoggerFactory.getLogger(PayChannelController.class);

    @Resource
    private PayChannelService payChannelService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private CommonResponse list() {
        LOG.info("LOG00100:支付渠道列表查询开始：");
        CommonResponse commonResponse = new CommonResponse();
        List<PayChannel> payChannelList = payChannelService.list();
        commonResponse.setContent(payChannelList);
        LOG.info("LOG00109:支付渠道列表查询开始：{}", commonResponse);
        return commonResponse;
    }

}
