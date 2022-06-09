package com.sparta.assignment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RestaurantRequestDto {


    //음식점 이름
    private String name;
    //최소 주문가격
    private int minOrderPrice;
    //기본 배달비
    private int deliveryFee;
}
