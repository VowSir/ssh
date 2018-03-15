package io.man.service;

import io.man.entity.User;

public interface UserService {

    //用户登陆
    User findUserById(Integer id);

    //添加用户
    void saveUser(User user);

    //查找用户
    void updateUser(User user);

    //删除用户
    void deleteUser(User user);
}
