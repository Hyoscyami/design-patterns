package chapter10;

import org.junit.Test;

/**
 * @Author xusf
 * @Date 20-1-28 下午7:47
 * @Description : 观察者模式
 */
public class ObserverTest {

    @Test
    public void test() {
        Boss boss = new Boss();
        StockObserver stockObserver = new StockObserver("张三",boss);
        StockObserver stockObserver1 = new StockObserver("张三2",boss);
        boss.add(stockObserver);
        boss.add(stockObserver1);
        boss.notifyA();
    }
}
