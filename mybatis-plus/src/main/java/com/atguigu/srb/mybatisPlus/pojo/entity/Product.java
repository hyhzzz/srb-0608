package com.atguigu.srb.mybatisPlus.pojo.entity;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

/**
 * ClassName: Product
 * Package: com.atguigu.srb.mybatisPlus.pojo.entity
 * Description:
 *
 * @Author coderhyh
 * @Create 2023/3/9 21:51
 * @Version 1.0
 */
@Data
public class Product {
    private Long id;
    private String name;
    private Integer price;

    //如果最初的版本是1，每当用户来对这个数据进行更新，既会将价格更新也会将版本更新+1
    @Version
    private Integer version;

}
