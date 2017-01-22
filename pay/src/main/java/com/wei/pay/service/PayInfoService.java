package com.wei.pay.service;

import com.wei.common.util.NoUtil;
import com.wei.common.util.UUIDUtil;
import com.wei.pay.domain.PayInfo;
import com.wei.pay.mapper.PayInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PayInfoService {

    @Resource
    private PayInfoMapper payInfoMapper;

    public List<PayInfo> list() {
        return payInfoMapper.selectByExample(null);
    }

    public PayInfo add(PayInfo payInfo) {
        payInfo.setPayOrderNo(NoUtil.generate("P"));
        payInfo.setId(UUIDUtil.generate());
        payInfo.setStatus("I");
        payInfoMapper.insert(payInfo);
        return payInfo;
    }

    public int delete(String id) {
        return payInfoMapper.deleteByPrimaryKey(id);
    }
}
