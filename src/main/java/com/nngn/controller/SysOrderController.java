
package com.nngn.controller;


import com.nngn.entity.User;
import com.nngn.service.SysOrderService;
import com.nngn.utils.ActionResult;
import com.nngn.vo.VOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;


/**
 * author:yanshuai
 * date 2020/12/22 20:45
 */

@RestController
public class SysOrderController {
    @Autowired
    private SysOrderService sysOrderService;
    @RequestMapping("/addOrder")
    public ActionResult addOrder(HttpSession session, Integer id, Integer getid, Integer backid, String oprice){
        System.out.println("id:"+id+"getid:"+getid+"backid:"+backid+"oprice:"+oprice);
        ActionResult result=null;
        User user = (User)session.getAttribute("user");
        System.out.println(user);
        if(user==null){
             result = new ActionResult(0, "您未登录",null);
        }else{
            sysOrderService.addOrder(user.getId(),id,getid,backid,oprice);
            result = new ActionResult(200,"成功",null);
        }
        return result;
    }
    @RequestMapping("/selectAll")
    public ActionResult selectAll(HttpSession session) {
        ActionResult result = null;
        User user = (User) session.getAttribute("user");
        System.out.println("id:"+user.getId());
        try {
            List<VOrder> map = sysOrderService.selectAll(user.getId());
            System.out.println(map);
           result = new ActionResult(200,"无",map);
        } catch (Exception e) {
            result = new ActionResult(0,e.getMessage(),null);
        }
        System.out.println(result);
        return result;

    }

}

