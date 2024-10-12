package Animals;

import Food.*;

public class Horse extends Herbivore implements Voice, Walk, Sleep {

    @Override
    public void sleep() {
        System.out.println("Лошадь спит в своей конюшне");
    }

    @Override
    public String voice() {
        return "Лошадь Иго-го";
    }


    @Override
    public void walk() {
        System.out.println("Лошадь ходит по своему вольеру");
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
        if (food instanceof Grass) {
            System.out.println("Лошадь ест траву");
        } else {
            System.out.println("Лошадь не плотоядное животное!");
        }
    }
}
