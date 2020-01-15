package chapter1;

import chapter1.service.CalculateFactory;
import chapter1.service.CalculateService;
import org.junit.Test;

import java.math.BigDecimal;

/**
* @Author xusf
* @Date 2020/1/15 9:46
* @Description : 简单工厂测试
*/
public class SimpleFactoryTest {
    /**
     * 其实这种简单工厂违反了开放封闭原则，新增计算方式要修改Factory代码，可以用反射实现不修改代码
     */
    @Test
    public void test(){
        CalculateService calculateService = CalculateFactory.createCalculate("+");
        System.out.println(calculateService.calculate(BigDecimal.ONE,BigDecimal.TEN));
    }
    @Test
    public void test2(){
        CalculateService calculateService = CalculateFactory.createCalculate("-");
        System.out.println(calculateService.calculate(BigDecimal.ONE,BigDecimal.TEN));
    }
}
