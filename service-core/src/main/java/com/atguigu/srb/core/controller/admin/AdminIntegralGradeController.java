package com.atguigu.srb.core.controller.admin;


import com.atguigu.srb.common.exception.Assert;
import com.atguigu.srb.common.result.R;
import com.atguigu.srb.common.result.ResponseEnum;
import com.atguigu.srb.core.pojo.entity.IntegralGrade;
import com.atguigu.srb.core.service.IntegralGradeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 积分等级表 前端控制器
 * </p>
 *
 * @author chujian
 * @since 2023-03-10
 */
//@CrossOrigin //解决跨域问题
@RestController
@RequestMapping("/admin/core/integralGrade")
@Api(tags = "积分等级管理")
public class AdminIntegralGradeController {

    @Resource
    private IntegralGradeService integralGradeService;

    @GetMapping("/list")
    @ApiOperation("积分等级列表")
    public R listAll() {
        List<IntegralGrade> list = integralGradeService.list();
        return R.ok().data("list", list);
    }

    @DeleteMapping("/remove/{id}")
    @ApiOperation(value = "根据id删除积分等级", notes = "逻辑删除")
    public R removeById(
            @ApiParam(value = "数据id", required = true, example = "1")
            @PathVariable Long id) {
        boolean result = integralGradeService.removeById(id);
        if (result) {
            //return R.setResult(ResponseEnum.UPLOAD_ERROR);
            return R.ok().message("删除成功");
        } else {
            return R.error().message("删除失败");
        }
    }

    @ApiOperation("更新积分等级")
    @PutMapping("/updateById")
    public R updateById(
            @ApiParam(value = "积分等级对象", required = true)
            @RequestBody IntegralGrade integralGrade) {
        boolean result = integralGradeService.updateById(integralGrade);
        if (result) {
            return R.ok().message("修改成功");
        } else {
            return R.error().message("修改失败");
        }

    }

    @ApiOperation("根据id获取积分等级")
    @GetMapping("/getById/{id}")
    public R getById(
            @ApiParam(value = "数据id", required = true, example = "1")
            @PathVariable Long id
    ) {
        IntegralGrade integralGrade = integralGradeService.getById(id);
        if (integralGrade != null) {
            return R.ok().data("record", integralGrade);
        } else {
            return R.error().message("数据不存在");
        }

    }

    @ApiOperation("新增积分等级")
    @PostMapping("/save")
    public R save(
            @ApiParam(value = "积分等级对象", required = true)
            @RequestBody IntegralGrade integralGrade) {

        //如果借款额度为空就手动抛出一个自定义的异常！
        if (integralGrade.getBorrowAmount() == null) {
            //BORROW_AMOUNT_NULL_ERROR(-201, "借款额度不能为空"),
            Assert.notNull(integralGrade.getBorrowAmount(), ResponseEnum.ERROR);
        }

        boolean result = integralGradeService.save(integralGrade);
        if (result) {
            return R.ok().message("保存成功");
        } else {
            return R.error().message("保存失败");
        }
    }
}

