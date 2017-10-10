package p21;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by changwenhu on 2017/5/8.
 */
public class Test1 {
    @Test
    public void demo1() {
        Arrays.asList("a", "b", "d").forEach(e -> System.out.println(e));

    }


    @Test
    public void demo2() {
        Arrays.asList("a", "b", "d").forEach((String e) -> System.out.println(e));

    }


    @Test
    public void demo3() {
        Arrays.asList("a", "b", "d").forEach(e -> {
            System.out.println(e);
            System.out.println(e);
        });
    }


    @Test
    public void demo4() {
        String separator = ","; //无需final修饰
        Arrays.asList("a", "b", "d").forEach(
                (String e) -> System.out.print(e + separator));


//        final String separator = ",";
//        Arrays.asList( "a", "b", "d" ).forEach(
//                ( String e ) -> System.out.print( e + separator ) );
    }

    @Test
    public void demo5() {
        //Lambda表达式有返回值，返回值的类型也由编译器推理得出。如果Lambda表达式中的语句块只有一行，则可以不用使用return语句，下列两个代码片段效果相同：
        Arrays.asList("a", "b", "d").sort((e1, e2) -> e1.compareTo(e2));

//        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
//            int result = e1.compareTo( e2 );
//            return result;
//        } );

    }


}
