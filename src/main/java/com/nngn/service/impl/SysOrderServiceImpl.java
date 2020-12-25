package com.nngn.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.nngn.dao.SysOrderDao;
import com.nngn.entity.SysOrder;
import com.nngn.service.SysOrderService;
import com.nngn.vo.VOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author:yanshuai
 * date 2020/12/22 20:29
 */
@Service
public class SysOrderServiceImpl implements SysOrderService {
    @Autowired
    private SysOrderDao sysOrderDao;

    @Override
    public void addOrder(Integer uid, Integer id, Integer getid, Integer backid, String oprices) {
        String status="已预订";
        double oprice = Double.parseDouble(oprices);
        SysOrder order = new SysOrder();
        order.setUid(uid);
        order.setCid(id);
        order.setGetid(getid);
        order.setBackid(backid);
        order.setOprice(oprice);
        order.setStatus(status);
        sysOrderDao.insert(order);
    }

    @Override
    public  List<VOrder> selectAll(Integer uid) {
        //PageHelper.startPage(page,5);
        List<VOrder> list = sysOrderDao.selectAll(uid);
        System.out.println("list:"+list);
        //Map<String,Object> map = new HashMap<>();
        //map.put("total",((Page)list).getTotal());
        //map.put("row",list);
        //System.out.println("map是:"+map);
        return list;
    }
}
