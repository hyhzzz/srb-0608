package com.atguigu.srb.mybatisPlus;

import com.atguigu.srb.mybatisPlus.mapper.UserMapper;
import com.atguigu.srb.mybatisPlus.pojo.entity.User;
import com.atguigu.srb.mybatisPlus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * ClassName: Test1
 * Package: com.atguigu.srb.mybatisPlus
 * Description:
 *
 * @Author coderhyh
 * @Create 2023/3/9 8:36
 * @Version 1.0
 */
@SpringBootTest
public class Test1 {


    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;


    @Test
    public void test01() {
        List<User> users = userMapper.selectList(null);
        //User user = userMapper.selectById(32);
        System.out.println(users);
    }

    @Test
    public void test02() {
        List<User> list = userService.list();
        User byId = userService.getById(1);
        System.out.println(list);
        System.out.println(byId);
    }

    @Test
    public void testSelectAllByName(){
        List<User> users = userMapper.selectAllByName("atguigu002");
        users.forEach(System.out::println);
    }
}
