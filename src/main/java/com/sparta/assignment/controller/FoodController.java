package com.sparta.assignment.controller;

import com.sparta.assignment.dto.FoodRequestDto;
import com.sparta.assignment.model.Food;
import com.sparta.assignment.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodController {


    private final FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }


    @PostMapping("/restaurant/{restaurantId}/food/register")
    public void createFood(@RequestBody List<FoodRequestDto> requestDto, @PathVariable Long restaurantId) {



        foodService.createFood(requestDto, restaurantId);

    }




}
