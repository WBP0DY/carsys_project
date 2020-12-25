package com.nngn.utils;

import lombok.Data;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 提供web对外接口的统一响应
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActionResult implements Serializable {

    private Integer statusCode;//响应码 （200，404）
    private String msg;//短消息
    private Object data;//响应携带的对象


}
