package com.example.recipes.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Ingredient {

    private String description;
    private BigDecimal amount;
}
