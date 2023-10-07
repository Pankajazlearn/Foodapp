package com.example.food.controller;

import com.example.food.model.FoodItem;
import com.example.food.repository.FoodRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FoodController {
    private final FoodRepository foodRepository;

    public FoodController(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @GetMapping("/")
    public String getAllFood(Model model) {
        List<FoodItem> foodItems = foodRepository.getAllFoodItems();
        model.addAttribute("foodItems", foodItems);
        return "index";
    }

    @GetMapping("/add")
    public String getAddFoodForm() {
        return "add-food";
    }

    @PostMapping("/add")
    public String addFoodItem(FoodItem foodItem) {
        foodRepository.addFoodItem(foodItem);
        return "redirect:/";
    }
}
