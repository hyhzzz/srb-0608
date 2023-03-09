package com.atguigu.srb.mybatisPlus.service;

import com.atguigu.srb.mybatisPlus.pojo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * ClassName: Usersrvice
 * Package: com.atguigu.srb.mybatisPlus.service
 * Description:
 *
 * @Author coderhyh
 * @Create 2023/3/9 15:54
 * @Version 1.0
 */
public interface UserService extends IService<User> {

    //自定义service
    List<User> getUserListByName(String name);
}
