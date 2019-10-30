package com.lvshuy.dao;

import com.lvshuy.model.User;

public interface IUserDao {

    User selectUser(long id);
}