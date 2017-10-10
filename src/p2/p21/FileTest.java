package p2.p21;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

/**
 * Created by changwenhu on 2017/6/21.
 */
public class FileTest {
    @Test
    public void test1() {
        File[] files = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isHidden();//判断隐藏文件
            }
        });
        for (File file : files) {
            System.out.println(file.getName());
        }
    }

    @Test
    public void test2() {
        Arrays.asList(
                new File(".").listFiles(File::isHidden)
        )
                .stream()
                .forEach(
                        file -> System.out.println(file.getName())

                );
    }

}
