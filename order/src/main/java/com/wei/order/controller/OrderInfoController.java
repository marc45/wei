package com.wei.order.controller;

import com.wei.common.domain.CommonResponse;
import com.wei.order.domain.OrderInfo;
import com.wei.order.service.OrderInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/order")
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
