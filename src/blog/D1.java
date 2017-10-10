package blog;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author changwenhu
 * @Date 2017/10/10
 * @Blog https://jetbrains.org.cn/
 * @Description ${todo}
 */
public class D1 {
    public static void main(String[] args) {
        Arrays.asList(1, 2, 3, 4).forEach(integer -> System.out.println(integer));
        System.out.println("==================================================");
        Arrays.asList(1, 2, 3, 4).forEach((Integer i) -> System.out.println(i));
        System.out.println("==================================================");

        Arrays.asList(1, 2, 3, 4).forEach(System.out::println);
        System.out.println("==================================================");

        Arrays.asList(1, 2, 3, 4).forEach(integer -> {
            System.out.println(integer);
            System.out.println(integer);
        });
        System.out.println("==================================================");

        String separator = ",";
        Arrays.asList(1, 2, 3, 4).forEach(integer -> {
            System.out.println(integer + separator);
        });
        System.out.println("==================================================");

        Arrays.asList(1, 2, 3, 4).sort(Integer::compareTo);
        Arrays.asList(1, 2, 3, 4).sort(Comparator.naturalOrder());

    }
}
