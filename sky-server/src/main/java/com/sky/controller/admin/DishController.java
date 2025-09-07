package com.sky.controller.admin;

import com.sky.dto.DishDTO;
import com.sky.result.Result;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 菜品管理
 */
@RestController
@RequestMapping("/admin/dish")
@Api(tags = "菜品相关接口")
@Slf4j
public class DishController {
    /**
     * 新增菜品
     * @param dishDTO
     * @return
     */
    public Result save(DishDTO dishDTO){
        log.info("新增新的菜品：{}",dishDTO);
        return Result.success();
    }
}
