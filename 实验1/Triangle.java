import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/***
 *
 * @author tiger
 * @date 2021年3月4日-下午8:43:13
 * @description 三角形测试用例
 */
public class Triangle {
    public String classify(int a, int b, int c) {
        if (a <1 || a>100 || b<1 || b>100 || c<1 || c> 100) {
            return "输入错误";
        }
        if (!((a + b > c) && (a + c > b) && (b + c > a))) {
            return "非三角形";
        } else if (a == b && a == c && b == c) {
            return "等边三角形";
        } else if (a != b && a != c && b != c) {
            return "不等边三角形";
        } else {
            return "等腰三角形";
        }
    }
}

class TriangleTest {
    @Test
    @DisplayName("输入错误")
     void parameters_error_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(0, 4, 5);
        assertEquals("输入错误", type);
    }
    @Test
    @DisplayName("不等边三角形")
    void scalene_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(3, 4, 6);
        assertEquals("不等边三角形", type);
    }
}
/**
 * @Title: Triangle.java
 * @Package cn.edu.ctgu.junitTest
 * @Description: 测试三角形是否为等边、等腰或者是不等边三角形，或不是三角形
 * @author tiger
 * @version V1.0
 */