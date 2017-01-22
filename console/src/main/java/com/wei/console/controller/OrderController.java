package com.wei.console.controller;

import com.wei.common.domain.CommonResponse;
import com.wei.common.domain.OrderInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderController {

    private static final Logger LOG = LoggerFactory.getLogger(OrderController.class);
    @Resource
    private RestTemplate restTemplate;

    @Value("${order.url}")
    private String orderUrl;

    @RequestMapping("/list")
    public CommonResponse list() throws ClassNotFoundException {
        LOG.info("LOG00060:查询订单开始");
        CommonResponse commonResponse = restTemplate.getForObject(orderUrl + "/order/info/list", CommonResponse.class);
        LOG.info("LOG00069:查询订单结束:" + commonResponse);
        return commonResponse;
    }

    @RequestMapping("/add")
    public CommonResponse save(@RequestBody OrderInfo orderInfo) {
        LOG.info("LOG00080:创建订单开始:{}", orderInfo);
        CommonResponse commonResponse = restTemplate.postForObject(orderUrl + "/order/info/add", orderInfo, CommonResponse.class);
        LOG.info("LOG00089:创建订单结束:" + commonResponse);
        return commonResponse;
    }

    @RequestMapping("/delete/{id}")
    public CommonResponse delete(@PathVariable(value = "id") String id) {
        LOG.info("LOG00090:删除订单开始:{}", id);
        CommonResponse commonResponse = new CommonResponse();
        restTemplate.delete(orderUrl + "/order/info/delete/" + id);
        LOG.info("LOG00099:删除订单结束:");
        return commonResponse;
    }
}
