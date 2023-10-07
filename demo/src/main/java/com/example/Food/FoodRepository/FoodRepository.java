package com.example.food.repository;

import com.example.food.model.FoodItem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FoodRepository {
    private List<FoodItem> foodItems = new ArrayList<>();

    // Methods to interact with the foodItems list
}
