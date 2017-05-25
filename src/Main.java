import domain.Apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {

//http://www.jianshu.com/p/5b800057f2d8

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ArrayList<Apple> apples = new ArrayList<>();

        Apple apple = new Apple();
        apple.setColor("red");
        apple.setWeoght("10");

        Apple apple1 = new Apple();
        apple1.setWeoght("20");
        apple1.setColor("dede111");

        apples.add(apple);
        apples.add(apple1);


        apples.sort(Comparator.comparing(Apple::getWeoght).reversed());

        apples.forEach(apple2 -> System.out.println(apple2.getWeoght()));

    }
}
