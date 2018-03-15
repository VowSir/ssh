package io.man.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 描述:
 *
 * @outhor ming
 * @create 2018-03-12 19:27
 */
@Setter@Getter@NoArgsConstructor@ToString
public class User {

    private Integer id;


    //用户名
    private String username;
    //用户的密码
    private String password;


}
