package o1;

import domain.Status;
import domain.Task;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//http://www.jianshu.com/p/5b800057f2d8

/**
 * Created by changwenhu on 2017/5/8.
 */
public class Test2 {
    final Collection<Task> tasks = Arrays.asList(
            new Task(Status.OPEN, 5),
            new Task(Status.OPEN, 13),
            new Task(Status.CLOSED, 8)
    );

    @Test
    public void demo1() {

        //首先看一个问题：在这个task集合中一共有多少个OPEN状态的点？在Java 8之前，要解决这个问题，则需要使用foreach循环遍历task集合；但是在Java 8中可以利用steams解决：包括一系列元素的列表，并且支持顺序和并行处理。

        int sum = tasks.stream()
                .filter(task -> task.getState() == Status.OPEN)
                .mapToInt(Task::getCode)
                .sum();
        System.out.println(sum);
        //这里有很多知识点值得说。首先，tasks集合被转换成steam表示；其次，在steam上的filter操作会过滤掉所有CLOSED的task；第三，mapToInt操作基于每个task实例的Task::getPoints方法将task流转换成Integer集合；最后，通过sum方法计算总和，得出最后的结果。


    }


    @Test
    public void demo2() {
        //steam的另一个价值是创造性地支持并行处理（parallel processing）。对于上述的tasks集合，我们可以用下面的代码计算所有任务的点数之和
        Integer reduce = tasks.stream()
                .parallel()
                .filter(task -> task.getState() == Status.OPEN)
                .mapToInt(Task::getCode)
//                .map(Task::getCode)
                .reduce(0, Integer::sum);
        System.out.println(reduce);
    }


    @Test
    public void demo3() {
        Map<String, List<Task>> collect = tasks.stream()
                .collect(
                        Collectors.groupingBy(Task::getState)
                );
        System.out.println(collect);


    }


    @Test
    public void demo4() {
//        final Collection< String > result = tasks
//                .stream()                                        // Stream< String >
//                .mapToInt( Task::getCode )                     // IntStream
//                .asLongStream()                                  // LongStream
//                .mapToDouble( points -> points / totalPoints )   // DoubleStream
//                .boxed()                                         // Stream< Double >
//                .mapToLong( weigth -> ( long )( weigth * 100 ) ) // LongStream
//                .mapToObj( percentage -> percentage + "%" )      // Stream< String>
//                .collect( Collectors.toList() );                 // List< String >
//
//        System.out.println( result );
    }


}
