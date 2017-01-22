package com.wei.pay.mapper;

import com.wei.pay.domain.PayChannel;
import com.wei.pay.domain.PayChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayChannelMapper {
    int countByExample(PayChannelExample example);

    int deleteByExample(PayChannelExample example);

    int deleteByPrimaryKey(String id);

    int insert(PayChannel record);

    int insertSelective(PayChannel record);

    List<PayChannel> selectByExample(PayChannelExample example);

    PayChannel selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PayChannel record, @Param("example") PayChannelExample example);

    int updateByExample(@Param("record") PayChannel record, @Param("example") PayChannelExample example);

    int updateByPrimaryKeySelective(PayChannel record);

    int updateByPrimaryKey(PayChannel record);
}