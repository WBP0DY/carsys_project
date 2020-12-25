package com.nngn.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarCity implements Serializable {
    private Integer id;
    private String name;
    private Integer pid;
}
