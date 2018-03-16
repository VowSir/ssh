package io.man.dao.impl;

import io.man.dao.UserDao;
import io.man.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * 描述:
 *
 * @outhor ming
 * @create 2018-03-14 17:58
 */
@Repository
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Autowired
    public void setSuperSessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    @Override
    public User findUserById(Integer id) {
        User load = this.getHibernateTemplate().load(User.class, id);
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
