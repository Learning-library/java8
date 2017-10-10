package p23;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @Author changwenhu
 * @Date 2017/10/10
 * @Blog https://jetbrains.org.cn/
 * @Description ${todo}
 */
public class Car {

    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }

    public static void main(String[] args) {
        Car car = Car.create(Car::new);//new
        List<Car> cars = Arrays.asList(car);

        Car.collide(Car.create(Car::new));
        //或者
        cars.forEach(Car::collide);//方法调用，接受的参数是car

        cars.forEach(Car::repair); //方法没有定义入参


        Car car1 = Car.create(Car::new);
        cars.forEach(car1::follow);


    }

    public void follow(final Car another) {
        System.out.println("Following the " + another.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }
}
