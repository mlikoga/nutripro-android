package com.oddsix.nutripro.models;

import com.oddsix.nutripro.rest.models.requests.NutrientRequest;
import com.oddsix.nutripro.utils.helpers.SharedPreferencesHelper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;

/**
 * Created by filippecl on 06/11/16.
 */

public class FoodModel implements Serializable {
    private List<NutrientModel> nutrients;
    private String foodName;
    private int quantity;

    public FoodModel(List<NutrientModel> nutrients, String foodName, int quantity) {
        this.nutrients = nutrients;
        this.foodName = foodName;
        this.quantity = quantity;
    }

    public void setNutrients(List<NutrientModel> nutrients) {
        this.nutrients = nutrients;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<NutrientModel> getNutrients() {
        return nutrients;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getQuantity() {
        return quantity;
    }
}
