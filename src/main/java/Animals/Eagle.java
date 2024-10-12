package Animals;

import Food.*;

public class Eagle extends Carnivorous implements Fly, Voice, Sleep {

    @Override
    public void sleep() {
        System.out.println("Орел спит в гнезде");
    }

    @Override
    public void fly() {
        System.out.println("Орел летит по небу");
    }

    @Override
    public String voice() {
        return "Орел кричит";
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
        if (food instanceof Grass) {
            System.out.println("Орел не ест траву!");
        } else if (food instanceof Fish) {
            System.out.println("Орел ест рыбу");
        } else if (food instanceof Meat) {
            System.out.println("Орел ест мясо");
        }
    }
}
