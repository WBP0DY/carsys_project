package com.nngn.dao;

import com.nngn.entity.SysOrder;
import com.nngn.vo.VOrder;

import java.util.List;

/**
 * author:yanshuai
 * date 2020/12/22 19:49
 */
public interface SysOrderDao {
    //根据id删除订单
    void deleteById(Integer id);
    //添加订单项
    void insert(SysOrder record);
    //添加一部分订单项
    void addSelective(SysOrder record);
    //通过id查询信息
    SysOrder selectById(Integer id);
    //修改一部分信息通过id
    void updateByIdSelective(SysOrder record);
    //修改全部信息通过id
    void updateById(SysOrder record);
    //
    List<VOrder> selectAll(Integer uid);
}
