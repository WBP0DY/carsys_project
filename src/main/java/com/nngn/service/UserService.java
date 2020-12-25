package com.nngn.service;

import com.nngn.entity.User;

public interface UserService {

    User findBy(String tel, String password);

    boolean checkByTel(String tel);

    void register(User user);

    User ask(String tel);
}
