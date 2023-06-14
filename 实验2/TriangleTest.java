import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    private Triangle triangle = new Triangle();

    // 3.1 一般边界值方法测试用例
    @Test
    void testGeneralBoundaryValues() {
        // 边界值测试用例
        Assertions.assertEquals("非三角形", triangle.classify(1, 2, 100));
        Assertions.assertEquals("非三角形", triangle.classify(2, 1, 99));

        // 一般值测试用例
        Assertions.assertEquals("等腰三角形", triangle.classify(3, 3, 5));
    }

    // 3.2 健壮性边界值方法测试用例
    @Test
    void testRobustBoundaryValues() {
        // 边界值测试用例
        Assertions.assertEquals("输入错误", triangle.classify(-1, 1, 2));
        Assertions.assertEquals("输入错误", triangle.classify(0, 1, 2));
        Assertions.assertEquals("输入错误", triangle.classify(1, -2, 100));
        Assertions.assertEquals("输入错误", triangle.classify(2, 100, -10));

        // 一般值测试用例
        Assertions.assertEquals("等腰三角形", triangle.classify(3, 50, 50));

        // 无效和异常值测试用例
        Assertions.assertEquals("非三角形", triangle.classify(1, 1, 2));
        Assertions.assertEquals("非三角形", triangle.classify(1, 2, 3));
    }

    // 3.3 最坏情况一般边界值分析方法测试用例
    @Test
    void testWorstCaseGeneralBoundaryValues() {
        Assertions.assertEquals("非三角形", triangle.classify(1, 1, 2));
        Assertions.assertEquals("等边三角形", triangle.classify(100, 100, 100));
        Assertions.assertEquals("等腰三角形", triangle.classify(100, 100, 99));
        Assertions.assertEquals("不等边三角形", triangle.classify(99, 98, 97));
    }

    // 3.4 最坏情况健壮性边界值分析方法测试用例
    @Test
    void testWorstCaseRobustBoundaryValues() {
        Assertions.assertEquals("输入错误", triangle.classify(-1, 1, 2));
        Assertions.assertEquals("输入错误", triangle.classify(0, 1, 2));
        Assertions.assertEquals("输入错误", triangle.classify(1, 2, 200));
        Assertions.assertEquals("输入错误", triangle.classify(2, 100, 101));
        Assertions.assertEquals("输入错误", triangle.classify(101, 100, 99));
        Assertions.assertEquals("输入错误", triangle.classify(102, 100, 99));
        Assertions.assertEquals("等边三角形", triangle.classify(100, 100, 100));
        Assertions.assertEquals("等腰三角形", triangle.classify(100, 100, 99));
        Assertions.assertEquals("不等边三角形", triangle.classify(99, 98, 97));
        Assertions.assertEquals("非三角形", triangle.classify(1, 1, 2));
        Assertions.assertEquals("非三角形", triangle.classify(1, 2, 3));

    }
}
