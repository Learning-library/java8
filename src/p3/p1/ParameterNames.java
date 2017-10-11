package p3.p1;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

/**
 * @Author changwenhu
 * @Date 2017/10/11
 * @Blog https://jetbrains.org.cn/
 * @Description ${todo}
 */
public class ParameterNames {
    public static void main(String[] args) {
        try {
            Method main = ParameterNames.class.getMethod("main", String[].class);
            Parameter[] parameters = main.getParameters();
            Arrays.stream(parameters).forEach(parameter -> System.out.println("Parameter: " + parameter.getName()));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
