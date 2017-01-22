package com.wei.order.controller;

import com.wei.common.domain.CommonResponse;
import com.wei.order.domain.OrderInfo;
import com.wei.order.service.OrderInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order/info")
public class OrderInfoController {

    @Resource
    private OrderInfoService orderInfoService;

    @RequestMapping("/list")
    private CommonResponse list() {
        CommonResponse commonResponse = new CommonResponse();
        List<OrderInfo> orderInfoList = orderInfoService.list();
        commonResponse.setContent(orderInfoList);
        return commonResponse;
    }
}
