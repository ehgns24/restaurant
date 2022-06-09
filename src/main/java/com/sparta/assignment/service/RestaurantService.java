package com.sparta.assignment.service;

import com.sparta.assignment.dto.RestaurantRequestDto;
import com.sparta.assignment.model.Restaurant;
import com.sparta.assignment.repository.FoodRepository;
import com.sparta.assignment.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;
    private final FoodRepository foodRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository, FoodRepository foodRepository) {
        this.restaurantRepository = restaurantRepository;
        this.foodRepository = foodRepository;
    }

    public Restaurant createRestaurant(RestaurantRequestDto requestDto) {
        // 요청받은 DTO 로 DB에 저장할 객체 만들기
        Restaurant restaurant = new Restaurant(requestDto);


        restaurantRepository.save(restaurant);

        return restaurant;
    }

    public List<Restaurant> getAllRestaurants() {

        return restaurantRepository.findAll();
    }



}
