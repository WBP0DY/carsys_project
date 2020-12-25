package com.nngn.dao;

import com.nngn.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User findBytel(String tel);

    void register(User user);
}
