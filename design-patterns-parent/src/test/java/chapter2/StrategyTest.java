package chapter2;

import org.junit.Test;

/**
 * @Author xusf
 * @Date 2020/1/15 10:27
 * @Description : 策略模式测试
 */
public class StrategyTest {
    /**
     * 加法策略
     */
    @Test
    public void test() {
        Context context = new Context(new AddStrategy());
        context.calculate();
    }

    /**
     * 减法策略
     */
    @Test
    public void test2() {
        Context context = new Context(new SubStrategy());
        context.calculate();
    }

    /**
     * 简单工厂和策略模式结合，相比较起来，简单工厂那个测试，要认识计算接口和工厂类，策略模式加简单工厂的话只要认识context就可以了，耦合更低
     * 但是这种写法还是违反了开放封闭原则，可以用反射改进
     */
    @Test
    public void test3(){
        Context context = new Context("+");
        context.calculate();
    }
}
