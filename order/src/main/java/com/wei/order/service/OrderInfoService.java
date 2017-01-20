package com.wei.order.service;

import com.wei.order.domain.OrderInfo;
import com.wei.order.mapper.OrderInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderInfoService {

    @Resource
    private OrderInfoMapper orderInfoMapper;

    public List<OrderInfo> list() {
        return orderInfoMapper.selectByExample(null);
    }

    public OrderInfo add(OrderInfo orderInfo) {
        orderInfoMapper.insert(orderInfo);
        return orderInfo;
    }
}
