package com.atguigu.srb.mybatisPlus.service.impl;

import com.atguigu.srb.mybatisPlus.mapper.UserMapper;
import com.atguigu.srb.mybatisPlus.pojo.entity.User;
import com.atguigu.srb.mybatisPlus.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: UserServiceImpl
 * Package: com.atguigu.srb.mybatisPlus.service.impl
 * Description:
 *
 * @Author coderhyh
 * @Create 2023/3/9 15:56
 * @Version 1.0
 */
@Service
//ServiceImpl<UserMapper, User>：service需要注入mapper，这个mapper就是suer所对应的mapper
public class UserServiceImpl  extends ServiceImpl<UserMapper, User> implements UserService {


    @Override
    public List<User> getUserListByName(String name) {
        List<User> users = baseMapper.selectAllByName(name);
        return users;
    }
}
