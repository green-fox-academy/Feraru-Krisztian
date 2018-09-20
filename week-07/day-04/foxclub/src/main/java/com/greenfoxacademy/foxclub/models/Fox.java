package com.greenfoxacademy.foxclub.models;

import com.greenfoxacademy.foxclub.Drink;
import com.greenfoxacademy.foxclub.Food;
import com.greenfoxacademy.foxclub.Trick;

import java.util.ArrayList;

public class Fox {
    private String name;
    private ArrayList<Trick> listOfTricks;
    private Food food;
    private Drink drink;

    public Food getFood() {
        return food;
    }

    public Drink getDrink() {
        return drink;
    }

    public Fox(String name) {
        this.name = name;
        listOfTricks = new ArrayList<>();
        this.food = Food.PIZZA;
        this.drink = Drink.LEMONADE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Trick> getListOfTricks() {
        return listOfTricks;
    }

    public void setListOfTricks(ArrayList<Trick> listOfTricks) {
        this.listOfTricks = listOfTricks;
    }
}






