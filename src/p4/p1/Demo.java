package p4.p1;

import java.util.Optional;

/**
 * @Author changwenhu
 * @Date 2017/10/11
 * @Blog https://jetbrains.org.cn/
 * @Description ${todo}
 */
public class Demo {

    public static void main(String[] args) {
        Optional<String> fullName = Optional.ofNullable(null);
        System.out.println("Full Name is set? " + fullName.isPresent());
        System.out.println("Full Name: " + fullName.orElseGet(() -> "[none]"));
        System.out.println(fullName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));


    }
}
