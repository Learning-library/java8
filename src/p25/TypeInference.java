package p25;

/**
 * @Author changwenhu
 * @Date 2017/10/10
 * @Blog https://jetbrains.org.cn/
 * @Description ${todo}
 */
public class TypeInference {
    public static void main(String[] args) {
        Value<String> stringValue = new Value<>();//这里给value 的泛型是String
        String orDefault = stringValue.getOrDefault("123", Value.defaultValue());//这里我们看到 Value.defaultValue() 编译通过 编译联想到泛型是string 根据上下文
        System.out.println(orDefault);
    }
}
