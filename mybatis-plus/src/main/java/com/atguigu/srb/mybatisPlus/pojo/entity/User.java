package com.atguigu.srb.mybatisPlus.pojo.entity;

import lombok.Data;

/**
 * ClassName: User
 * Package: com.atguigu.srb.mybatisPlus.bean
 * Description:
 *
 * @Author coderhyh
 * @Create 2023/3/9 8:03
 * @Version 1.0
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
