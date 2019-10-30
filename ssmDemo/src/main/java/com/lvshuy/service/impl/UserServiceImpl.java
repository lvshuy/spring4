package com.lvshuy.service.impl;

import com.lvshuy.dao.IUserDao;
import com.lvshuy.model.User;
import com.lvshuy.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }
}