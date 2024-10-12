package Animals;

import Food.*;

public class Camel extends Herbivore implements Voice, Walk, Sleep {
    @Override
    public void sleep() {
        System.out.println("Верблюд спит в пустыне");
    }

    @Override
    public String voice() {
        return "Верблюд фыркает";
    }

    @Override
    public void walk() {
        System.out.println("Верблюд бродит по пустыне");
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
        if (food instanceof Grass) {
            System.out.println("Верблюд ест траву");
        } else {
            System.out.println("Верблюд не плотоядное животное!");
        }
    }
}
