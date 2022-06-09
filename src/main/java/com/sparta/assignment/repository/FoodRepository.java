package com.sparta.assignment.repository;

import com.sparta.assignment.model.Food;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FoodRepository extends JpaRepository<Food, Long> {
    List<Food> findByName(String name);
    Optional<Food> findByNameAndRestaurantId(String name, Long restaurantId);
    Optional<Food> findByRestaurantId(Long restaurantId);

    List<Food> findAllByRestaurantId(Long restaurantId);

}
