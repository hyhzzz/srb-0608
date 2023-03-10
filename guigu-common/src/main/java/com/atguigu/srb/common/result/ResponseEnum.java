package com.atguigu.srb.common.result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * ClassName: ResponseEnum
 * Package: com.atguigu.srb.common.result
 * Description:
 *
 * @Author coderhyh
 * @Create 2023/3/10 13:08
 * @Version 1.0
 */
@Getter
@AllArgsConstructor
@ToString
public enum ResponseEnum {

    SUCCESS(0, "成功"),
    ERROR(-1, "服务器内部错误"),
    ;

    // 响应状态码
    private Integer code;
    // 响应信息
    private String message;
}
