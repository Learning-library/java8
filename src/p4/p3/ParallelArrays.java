package p4.p3;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author changwenhu
 * @Date 2017/10/11
 * @Blog https://jetbrains.org.cn/
 * @Description ${todo}
 */
public class ParallelArrays {

    public static void main(String[] args) {
        long[] arrayOfLong = new long[20000];

        //放入随机数到数组中
        Arrays.parallelSetAll(arrayOfLong,
                index -> ThreadLocalRandom.current().nextInt(1000000));

        System.out.print("没有升序排列 : ");
        Arrays.stream(arrayOfLong).limit(10).forEach(
                i -> System.out.print(i + " "));

        System.out.println();


        System.out.print("升序排列 : ");
        Arrays.parallelSort(arrayOfLong);

        Arrays.stream(arrayOfLong).limit(10).forEach(
                i -> System.out.print(i + " "));

        System.out.println();
    }


}
