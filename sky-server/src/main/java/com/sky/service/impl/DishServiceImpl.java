package com.sky.service.impl;

import com.sky.dto.DishDTO;
import com.sky.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class DishServiceImpl implements DishService {
    @Transactional
    public void saveWithFlavor(DishDTO dishDTO){

    }
}
