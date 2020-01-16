package chapter5;

import org.junit.Test;

import java.math.BigDecimal;

/**
* @Author xusf
* @Date 2020/1/16 17:39
* @Description : 工厂模式
*/
public class FactoryTest {
    /**
     * 工厂模式测试
     */
    @Test
    public void test(){
//        如果要换减法的话，只要改成new SubFactory();就可以了
        CalculateFactory calculateFactory = new AddFactory();
        CalculateService calculateService = calculateFactory.createService();
        System.out.println(calculateService.calculate(BigDecimal.ONE,BigDecimal.TEN));
        System.out.println(calculateService.calculate(BigDecimal.ONE,BigDecimal.TEN));
    }
}
