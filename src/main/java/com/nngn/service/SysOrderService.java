package com.nngn.service;

import com.nngn.vo.VOrder;

import java.util.List;
import java.util.Map;

/**
 * author:yanshuai
 * date 2020/12/22 20:19
 */

public interface SysOrderService {
    //添加订单
    void addOrder(Integer uid, Integer id, Integer getid, Integer backid, String oprice);
    List<VOrder> selectAll(Integer uid);
}
