package io.man.dao;

import io.man.entity.User;

/**
 * 描述:
 *
 * @outhor ming
 * @create 2018-03-14 17:53
 */
public interface UserDao {

    //查找用户
    User findUserById(Integer id);

    //添加用户
    void saveUser(User user);

    //查找用户
    void updateUser(User user);

    //删除用户
    void deleteUser(User user);
}
