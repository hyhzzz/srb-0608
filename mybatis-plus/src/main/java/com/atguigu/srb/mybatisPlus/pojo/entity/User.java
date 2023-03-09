package com.atguigu.srb.mybatisPlus.pojo.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.time.LocalDateTime;

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
//@TableName(value = "t_user") //如果实体类的名字是User，数据库表名是t_user 就得用这个
public class User {
    //mybatis-plus默认用的是id作为主键，如果主键改了就找不到了
    //@TableId // 将这个属性所对应的数据库字段来指定为主键，有两个属性：type属性用来定义主键策略默认是雪花算法生成id 前提：必须要有自动递增   value属性
    //private Long uid;

    //@TableId(value="uid",type = IdType.AUTO)// 当实体类的属性id和数据库中的id不一致的时候 就需要value属性来指定主键的字段
    //@TableId(value="uid") //设置了全局主键生成策略
    private Long id;

    //private String userName;  //MP会自动将数据库中的下划线命名风格转化为实体类中的驼峰命名风格，所以不需要使用@TableField
    //@TableField("user_name")
    private String name;//@TableField("user_name")  //实体属性字段name 数据库字段user_name 属性名和字段不一致 需要使用@TableField()来指定属性名所对应的字段名
    private Integer age;
    private String email;

    //逻辑删除字段
    //@TableLogic
    //private Integer is_deleted;


    //自动填充 项目中经常会遇到一些数据，每次都使用相同的方式填充，例如记录的创建时间，更新时间等。
    @TableField(fill = FieldFill.INSERT)//INSERT：插入时填充字段
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE) //INSERT_UPDATE：插入和更新时填充字段
    private LocalDateTime updateTime;


}
