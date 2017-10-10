package p2.p26;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author changwenhu
 * @Date 2017/10/10
 * @Blog https://jetbrains.org.cn/
 * @Description ${todo}
 */
public class Annotations {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        final Holder<String> holder = new @NonEmpty Holder<String>();
        @NonEmpty Collection<@NonEmpty String> strings = new ArrayList<>();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})//注解使用类型是参数
    public @interface NonEmpty {
    }

    public static class Holder<@NonEmpty T> extends @NonEmpty Object {
        public Holder() {
            System.out.println("11111");
        }

        public void method() throws @NonEmpty Exception {
            System.out.println("123");
        }
    }
}
