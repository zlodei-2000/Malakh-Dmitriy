package main.java.Animals;

import main.java.Food.*;

public class Dolphin extends Carnivorous implements Swim, Voice, Sleep {

    @Override
    public void sleep() {
        System.out.println("Дельфин спит в море");
    }

    @Override
    public String swim() {
        String swim = "Дельфин плавает в море";
        System.out.println(swim);
        return swim;
    }

    @Override
    public String voice() {
        return "Дельфин свистит";
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
        if (food instanceof Fish) {
            System.out.println("Дельфин ест рыбу");
        } else {
            System.out.println("Дельфин ничего кроме рыбы не ест!");
        }
    }
}
