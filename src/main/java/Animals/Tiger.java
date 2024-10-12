package main.java.Animals;

import main.java.Food.*;

public class Tiger extends Carnivorous implements Swim, Voice, Walk, Sleep {

    @Override
    public void sleep() {
        System.out.println("Тигр спит в кустах");
    }

    @Override
    public void walk() {
        System.out.println("Тигр ходит по лесу");
    }


    @Override
    public String swim() {
        String swim = "Тигр хоть и сухопутный, но плавает в пруду чтобы охладиться";
        System.out.println(swim);
        return swim;
    }

    @Override
    public String voice() {
        return "Тигр рычит";
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
        if (food instanceof Meat) {
            System.out.println("Тигр ест мясо");
        } else {
            System.out.println("Тигр не есть ничего кроме мяса!");
        }
    }
}
