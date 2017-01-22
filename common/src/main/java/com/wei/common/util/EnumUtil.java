package com.wei.common.util;

import com.wei.common.enums.OrderStatus;

import java.util.HashMap;
import java.util.Map;

public class EnumUtil {
    public static Map<String, String> queryEnum(String enumName) {
        Map<String, String> map = new HashMap<>();

        switch (enumName) {
            case "orderStatus":
                for (OrderStatus orderStatus : OrderStatus.values()) {
                    map.put(orderStatus.name(), orderStatus.getDescription());
                }
                break;
            default:
        }

        return map;
    }
}
