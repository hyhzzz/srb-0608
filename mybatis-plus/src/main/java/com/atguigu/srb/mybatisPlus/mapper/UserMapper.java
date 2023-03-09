package com.atguigu.srb.mybatisPlus.mapper;

import com.atguigu.srb.mybatisPlus.pojo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: UserMapper
 * Package: com.atguigu.srb.mybatisPlus.mapper
 * Description:
 *
 * @Author coderhyh
 * @Create 2023/3/9 15:48
 * @Version 1.0
 */

public interface UserMapper  extends BaseMapper<User> {

    //自定义mapper
    List<User> selectAllByName(@Param("name") String name);
}
