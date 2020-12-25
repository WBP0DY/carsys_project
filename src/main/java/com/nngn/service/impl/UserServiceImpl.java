package com.nngn.service.impl;

import com.nngn.dao.UserDao;
import com.nngn.entity.User;
import com.nngn.service.UserService;
import com.nngn.utils.MailUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    private UserDao userDao;
    @Override
    public User findBy(String tel, String password) {
        User user = userDao.findBytel(tel);
        System.out.println(user);
        if (user==null) {
            throw new RuntimeException("用户未注册");
        } if (!user.getPassword().equals(password)) {
            throw new RuntimeException("密码错误");
        }
        return user;
    }

    @Override
    public boolean checkByTel(String tel) {
        User user = userDao.findBytel(tel);
        if (user==null) {

            return true;
        }else {
            return false;

        }
    }

    @Override
    public void register(User user) {
        String content = "恭喜您成为车速递尊享会员" ;
        MailUtils.sendMail(user.getEmail(), content, "车速递官方温馨提示") ;
        userDao.register(user);
    }

    @Override
    public User ask(String tel) {
        User user=userDao.findBytel(tel);
        String content = user.getPassword();
        MailUtils.sendMail(user.getEmail(), content, "密码已找回") ;
        return user;
    }
}
