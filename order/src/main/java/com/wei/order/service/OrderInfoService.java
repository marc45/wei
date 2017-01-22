package com.wei.order.service;

import com.wei.common.util.NoUtil;
import com.wei.common.util.UUIDUtil;
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
        orderInfo.setOrderNo(NoUtil.generate("O"));
        orderInfo.setId(UUIDUtil.generate());
        orderInfo.setStatus("I");
        orderInfoMapper.insert(orderInfo);
        return orderInfo;
    }

    public int delete(String id) {
        return orderInfoMapper.deleteByPrimaryKey(id);
    }
}
