import domain.Apple;

import java.util.ArrayList;

import static java.util.Comparator.comparing;

public class Main {


    public static void main(String[] args) {
        System.out.println("测试java8比较苹果重量");

        ArrayList<Apple> apples = new ArrayList<>();

        Apple apple = new Apple();
        apple.setColor("red");
        apple.setWeoght("10");

        Apple apple1 = new Apple();
        apple1.setWeoght("20");
        apple1.setColor("fucking you");

        apples.add(apple);
        apples.add(apple1);


        apples.sort(comparing(Apple::getWeoght).reversed());//倒序

        apples.stream().forEach(apple2 -> {
            System.out.println(apple2.getWeoght());
        });

    }
}
