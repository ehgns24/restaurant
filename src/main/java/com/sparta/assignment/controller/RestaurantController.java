package com.sparta.assignment.controller;

import com.sparta.assignment.dto.RestaurantRequestDto;
import com.sparta.assignment.model.Food;
import com.sparta.assignment.model.Restaurant;
import com.sparta.assignment.service.FoodService;
import com.sparta.assignment.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RestaurantController {

    private final RestaurantService restaurantService;
    private final FoodService foodService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService, FoodService foodService) {
        this.restaurantService = restaurantService;
        this.foodService = foodService;
    }


    @PostMapping("/restaurant/register")
    public Restaurant createRestaurant(@RequestBody RestaurantRequestDto requestDto) {

        // 응답 보내기
        return restaurantService.createRestaurant(requestDto);
    }

    @GetMapping("/restaurants")
    public List<Restaurant> getAllRestaurants() {
        // 응답 보내기
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("/restaurant/{restaurantId}/foods")
    public List<Food> getAllFoods(@PathVariable Long restaurantId){

        return foodService.getFoodsInRestaurant(restaurantId);

    }

}
