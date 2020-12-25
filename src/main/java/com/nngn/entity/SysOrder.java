package com.nngn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * 订单的实体类
 * author:yanshuai
 * date 2020/12/22 19:36
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Repository
public class SysOrder implements Serializable {
    private Integer id;  //订单id
    private Integer cid;    //汽车id
    private  Integer uid;      //用户id
    private  Integer getid;     //取车地址id
    private  Integer backid;    //还车地址id
    private Double oprice;      //租车金额
    private  String status;     //车辆状态
}
