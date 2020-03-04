package chapter17;

import org.junit.Test;

/**
 * @Author xusf
 * @Date 2020/2/29 18:58
 * @Description : 桥接模式测试
 */
public class BridgingTest {
    @Test
    public void test(){
        Abstraction abstraction = new RefinedAbstraction();
        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();
    }
}
