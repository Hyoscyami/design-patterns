package chapter21;

import org.junit.Test;

/**
 * @Author xusf
 * @Date 2020/3/4 22:58
 * @Description : 享元模式测试
 */
public class FlyweightTest {
    @Test
    public void test(){
        int extrinsicstate = 22;
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight flyweightX = flyweightFactory.getFlyweight("x");
        flyweightX.operation(--extrinsicstate);

        Flyweight flyweightY = flyweightFactory.getFlyweight("y");
        flyweightY.operation(--extrinsicstate);

        Flyweight flyweightZ = flyweightFactory.getFlyweight("z");
        flyweightZ.operation(--extrinsicstate);

        UnSharedConcreteFlyweight unSharedConcreteFlyweight = new UnSharedConcreteFlyweight();
        unSharedConcreteFlyweight.operation(--extrinsicstate);
    }
}
