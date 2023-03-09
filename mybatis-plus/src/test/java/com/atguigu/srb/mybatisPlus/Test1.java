package com.atguigu.srb.mybatisPlus;

import com.atguigu.srb.mybatisPlus.mapper.UserMapper;
import com.atguigu.srb.mybatisPlus.pojo.entity.User;
import com.atguigu.srb.mybatisPlus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
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
        //通过条件构造器查询一个list集合，如果没有条件，可以设置为null为参数，表示查询所有
        List<User> users = userMapper.selectList(null);
        //User user = userMapper.selectById(32);
        System.out.println(users);
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setName("初见");
        user.setAge(23);
        //如果不设置email属性，则生成的动态sql中不包括email字段
        user.setEmail("1554283077@qq.com");
        int result = userMapper.insert(user);
        System.out.println("影响的行数：" + result); //影响的行数
        System.out.println("id：" + user.getId()); //没有设置id的话，id就自动回填
    }

    @Test
    public void testDelete(){
        int result = userMapper.deleteById(5);
        System.out.println("影响的行数：" + result);
    }

    @Test
    public void testDelete02(){
        List<Long> list = Arrays.asList(1L, 2L);
        int result = userMapper.deleteBatchIds(list);
        System.out.println("影响的行数：" + result);
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
        List<User> users = userMapper.selectAllByName("Tom");
        users.forEach(System.out::println);
    }

    @Test
    public void testListAllByName(){
        List<User> users = userService.getUserListByName("Sandy");
        users.forEach(System.out::println);
    }
}
