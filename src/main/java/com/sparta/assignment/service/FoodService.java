package com.sparta.assignment.service;
import com.sparta.assignment.dto.FoodRequestDto;
import com.sparta.assignment.model.Food;
import com.sparta.assignment.repository.FoodRepository;
import com.sparta.assignment.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {

    private final FoodRepository foodRepository;
    private final RestaurantRepository restaurantRepository;

    @Autowired
    public FoodService(FoodRepository foodRepository, RestaurantRepository restaurantRepository) {
        this.foodRepository = foodRepository;
        this.restaurantRepository = restaurantRepository;

    }

    public void createFood(List<FoodRequestDto> requestDto, Long restaurantId) {


        for (int i = 0; i < requestDto.size(); i++) {

            String name = requestDto.get(i).getName();
            Optional<Food> found = foodRepository.findByNameAndRestaurantId(name,restaurantId);

                if (requestDto.get(i).getPrice() < 100 || requestDto.get(i).getPrice() > 1000000 || requestDto.get(i).getPrice() % 100 != 0) {
                    throw new IllegalArgumentException("최소주문금액을 맞춰주세요");
                }
                if(found.isPresent()){
                    throw new IllegalArgumentException("메뉴가 중복됩니다.");
                }


            Food food = new Food(requestDto.get(i), restaurantId);
                    foodRepository.save(food);

            }
        }





        // 요청받은 DTO 로 DB에 저장할 객체 만들


    public List<Food> getFoodsInRestaurant(Long restaurantId) {

        return foodRepository.findAllByRestaurantId(restaurantId);
    }
}
