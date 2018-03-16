package io.man.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import io.man.entity.User;
import io.man.service.UserService;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * 描述:
 * 用户的action
 *
 * @outhor ming
 * @create 2018-03-12 18:29
 */
@Controller
@Scope("prototype")
@Namespace("/")
@ParentPackage("struts-default")
public class UserAction extends ActionSupport implements ModelDriven<User> {
    User user = new User();

    @Autowired
    private UserService userService;


    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @Action(value = "user_add",results={@Result(name = "success",location = "/success.jsp")})
    public String add() {

        userService.saveUser(user);

        System.out.println(userService);

        return SUCCESS;

    }

    //测试玩玩而已
    public void find() {
        String id =  ServletActionContext.getRequest().getParameter("id");
        Integer i = Integer.parseInt(id);
        User userById = userService.findUserById(i);
        System.out.println(userById);
    }



    @Override
    public User getModel() {
        return user;
    }
}
