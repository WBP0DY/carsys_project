package com.nngn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * author:yanshuai
 * date 2020/12/22 21:21
 */@Controller
public class indexController {
    @RequestMapping("/")
    public String index(){
        return "pagehome/index";
    }
    @RequestMapping("/mymain")
        public String order(){
            return "mymain/mymain";
        }
    @RequestMapping("/myinfo")
    public String myinfo(){
        return "mymain/myinfo";
    }
    @RequestMapping("/login")
    public String login(){
        return "pagehome/login";
    }
    @RequestMapping("/register")
    public String register(){
        return "pagehome/register";
    }
    @RequestMapping("/loginsuccess")
    public String loginsuccess(){
        return "pagehome/loginsuccess";
    }
    @RequestMapping("/shortrent")
    public String shortrent(){
        return "shortRent/shortrent";
    }
    @RequestMapping("/shortsort")
    public String showShortsort(){
        return "shortRent/shortsort";
    }
    //    显示用户清单
    @RequestMapping("/userList")
    public String showUserLsit(){
        return "admin/userList";
    }

    @RequestMapping("/ordersubmit")
    public String orderSubmit(){
        return "order/ordersubmit";
    }
}

