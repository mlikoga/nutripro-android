package com.oddsix.nutripro.rest.models.responses;

import android.content.Intent;

import java.io.Serializable;
import java.util.List;

/**
 * Created by filippecl on 20/12/16.
 */

public class FoodResponse implements Serializable {
    String name;
    String id;
    Integer quantity;
    List<NutrientResponse> nutrients;

    public List<NutrientResponse> getNutrients() {
        return nutrients;
    }

    public FoodResponse(String name, String id, int quantity) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
    }

    public FoodResponse(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
