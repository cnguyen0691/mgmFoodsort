package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class MgmInterviewFoodSort
{
    public static void main (String[] args)
    {
        List<Food> foods = new ArrayList<Food>();
        foods.add(new Food("Tomato", 11));
        foods.add(new Food("Potato", 1));
        foods.add(new Food("Potato", 42));
        foods.add(new Food("Potato", 77));
        foods.add(new Food("Potato", 55));
        foods.add(new Food("Potato", 46));
        foods.add(new Food("Potato", 12));
        foods.add(new Food("Potato", 11));
        foods.add(new Food("Tomato", 121));
        foods.add(new Food("Potato", 9));

        Collections.sort(foods, new sizeSorted());


        System.out.println("Result");
        for (int i=0; i<foods.size(); i++)
            System.out.println(foods.get(i));
    }
}


class Food
{
    String name;
    int size;

    public Food(String name,int size)
    {
        this.name = name;
        this.size = size;
    }

    public String toString()
    {
        return this.name + " " + this.size;
    }
}

class sizeSorted implements Comparator<Food>
{
    public int compare(Food potato, Food tomato)
    {
        if(potato.size==tomato.size){
            return potato.name.compareTo(tomato.name);
        }
        return potato.size - tomato.size;
    }
}