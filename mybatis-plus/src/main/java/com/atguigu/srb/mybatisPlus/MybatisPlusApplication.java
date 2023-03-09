package com.atguigu.srb.mybatisPlus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName: MybatisPlusApplication
 * Package: com.atguigu.srb.mybatisPlus
 * Description:
 *
 * @Author coderhyh
 * @Create 2023/3/9 8:01
 * @Version 1.0
 */
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) //排除数据源
@SpringBootApplication
@MapperScan("com.atguigu.srb.mybatisPlus.mapper") //扫描 Mapper 文件夹
public class MybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class,args);
    }
}
