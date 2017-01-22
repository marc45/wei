package com.wei.pay.service;

import com.wei.common.util.NoUtil;
import com.wei.common.util.UUIDUtil;
import com.wei.pay.domain.PayChannel;
import com.wei.pay.mapper.PayChannelMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PayChannelService {

    @Resource
    private PayChannelMapper payChannelMapper;

    public List<PayChannel> list() {
        return payChannelMapper.selectByExample(null);
    }

}
