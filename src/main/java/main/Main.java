package main;

import Animals.*;
import Food.*;

public class Main {

    public static void main(String[] args) {

        //Создаются объекты животных
        Camel camel = new Camel();
        Horse horse = new Horse();
        Tiger tiger = new Tiger();
        Dolphin dolphin = new Dolphin();
        Eagle eagle = new Eagle();

        // работник
        Worker mike = new Worker();

        //Создаются объекты еды
        Meat meat = new Meat();
        Grass grass = new Grass();
        Fish fish = new Fish();

        drawSeparator();
        camel.walk();
        horse.walk();
        tiger.walk();
        dolphin.swim();
        eagle.fly();

        drawSeparator();
        camel.sleep();
        horse.sleep();
        tiger.sleep();
        dolphin.sleep();
        eagle.sleep();

        drawSeparator();
        mike.feed(tiger, grass);
        mike.feed(tiger, meat);
        mike.feed(dolphin, fish);
        mike.feed(dolphin, grass);
        mike.feed(dolphin, meat);
        mike.feed(eagle, fish);
        mike.feed(eagle, grass);
        mike.feed(camel, grass);
        mike.feed(camel, meat);
        mike.feed(horse, fish);
        mike.feed(horse, grass);

        //Животные подают голос работнику
        drawSeparator();
        mike.getVoice(tiger);
        mike.getVoice(eagle);
        mike.getVoice(horse);
        mike.getVoice(dolphin);
        mike.getVoice(camel);

        drawSeparator();

    }

    public static void drawSeparator() {
        System.out.println("----------");
    }
}
