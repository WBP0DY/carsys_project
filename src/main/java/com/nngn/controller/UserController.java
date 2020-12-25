package com.nngn.controller;


import com.nngn.entity.User;
import com.nngn.service.UserService;
import com.nngn.utils.ActionResult;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("/user")

public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/login2",method = RequestMethod.GET)
    public ActionResult login(String tel , String password, HttpSession session) {

        try {
            User user = userService.findBy(tel, password);
            session.setAttribute("user",user);
            return new ActionResult(1,"用户登陆成功",user);
        } catch (Exception e) {
            e.printStackTrace();
            return new ActionResult(0,"用户未注册",null);//登录失败应添加跳转值登录页面
        }


    }

    @RequestMapping(value = "/check",method = RequestMethod.POST)
    public ActionResult checkUser( String tel){
        boolean byTel = userService.checkByTel(tel);
        if (byTel) {
            return new ActionResult(0,"用户名可以使用",null);
        }else{
            return new ActionResult(1,"用户名不可以使用",null);
        }

    }
    @RequestMapping(value = "/register2",method = RequestMethod.POST)

    public ActionResult register(User user){
             System.out.println("请求进入");
             System.out.println(user);
            userService.register(user);
            return new ActionResult(1,"注册成功",null);
    }
    @RequestMapping(value = "/ask",method = RequestMethod.POST)
    public ActionResult ask( String tel){
        System.out.println(tel);
        userService.ask(tel);
        return null;
    }
    @RequestMapping("/findUserTel")
    public ActionResult findUserTel(HttpSession session){
        User user = (User) session.getAttribute("user");
        System.out.println("登陆成功用户:"+user);
        return new ActionResult(200,"无",user);
    }
}
