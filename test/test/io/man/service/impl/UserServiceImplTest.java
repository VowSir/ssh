package test.io.man.service.impl;

import io.man.entity.User;
import io.man.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void findUserById() throws Exception {
        User userById = userService.findUserById(1);

        System.out.println(userById);


    }

    //保存一个用户的测试
    @Test
    public void saveUser() throws Exception {
        User user = new User();
        user.setUsername("ls");
        user.setPassword("456");
        userService.saveUser(user);

    }

    @Test
    public void updateUser() throws Exception {

    }

    @Test
    public void deleteUser() throws Exception {
    }

}