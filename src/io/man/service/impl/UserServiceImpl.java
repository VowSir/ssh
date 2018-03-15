package io.man.service.impl;

import io.man.dao.UserDao;
import io.man.entity.User;
import io.man.service.UserService;

/**
 * 描述:
 * userservice
 *
 * @outhor ming
 * @create 2018-03-12 19:12
 */

public class UserServiceImpl implements UserService {


    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findUserById(Integer id) {

        return userDao.findUserById(id);
    }

    @Override
    public void saveUser(User user) {

        userDao.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);

    }

    @Override
    public void deleteUser(User user) {

    }
}
