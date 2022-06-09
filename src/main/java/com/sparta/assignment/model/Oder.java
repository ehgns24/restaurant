package com.sparta.assignment.model;

import com.sparta.assignment.dto.OderRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Setter
@Getter // get 함수를 일괄적으로 만들어줍니다.
@NoArgsConstructor // 기본 생성자를 만들어줍니다.
@Entity
public class Oder {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(nullable = false)
    private Long restaurantId;


    @Column(nullable = false)
    private Long id;


    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private String foods;





    public Oder(OderRequestDto requestDto) {
        this.restaurantId = getRestaurantId();
        this.quantity = getQuantity();
        this.id = getId();
        this.foods = getFoods();



    }

}
