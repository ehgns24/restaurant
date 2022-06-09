package com.sparta.assignment.service;

import com.sparta.assignment.dto.FoodRequestDto;
import com.sparta.assignment.dto.OderRequestDto;
import com.sparta.assignment.dto.RestaurantRequestDto;
import com.sparta.assignment.model.Oder;
import com.sparta.assignment.model.Restaurant;
import com.sparta.assignment.repository.FoodRepository;
import com.sparta.assignment.repository.OderRepository;
import com.sparta.assignment.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OderService {
    private final OderRepository oderRepository;
    private final FoodRepository foodRepository;

    private final RestaurantRepository restaurantRepository;

    @Autowired
    public OderService(OderRepository oderRepository, FoodRepository foodRepository, RestaurantRepository restaurantRepository) {
        this.oderRepository = oderRepository;
        this.foodRepository = foodRepository;
        this.restaurantRepository = restaurantRepository;
    }

    public Oder createOder(OderRequestDto requestDto) {
        // 요청받은 DTO 로 DB에 저장할 객체 만들기
        Oder oder = new Oder(requestDto);
        Id = r


        oderRepository.save(oder);

        return oder;
    }
}
