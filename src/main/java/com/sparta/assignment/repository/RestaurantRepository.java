package com.sparta.assignment.repository;

import com.sparta.assignment.model.Food;
import com.sparta.assignment.model.Restaurant;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
