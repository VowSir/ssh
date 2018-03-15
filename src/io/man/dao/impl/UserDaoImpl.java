package io.man.dao.impl;

import io.man.dao.UserDao;
import io.man.entity.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * 描述:
 *
 * @outhor ming
 * @create 2018-03-14 17:58
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {


    @Override
    public User findUserById(Integer id) {
        User load = this.getHibernateTemplate().get(User.class, id);
        return load;
    }

    @Override
    public void saveUser(User user) {
        this.getHibernateTemplate().save(user);

    }

    @Override
    public void updateUser(User user) {
        this.getHibernateTemplate().update(user);
    }

    @Override
    public void deleteUser(User user) {

    }
}
