package com.nngn.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author:yanshuai
 * date 2020/12/22 18:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VOrder implements Serializable {
    private Integer oid;
    private Double oprice;
    private String cname;
    private String getcity;
    private String backcity;
    private String ostatus;
}
