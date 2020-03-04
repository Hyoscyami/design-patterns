package chapter19;

import org.junit.Test;

/**
 * @Author xusf
 * @Date 2020/3/1 12:18
 * @Description : 职责链模式
 */
public class ChainTest {
    @Test
    public void test() {
        Handler handler = new ConcreteHandler();
        Handler handler1 = new ConcreteHandlerB();
//        设置职责链下一个执行者
        handler.setSuccessor(handler1);

        int[] requests = {0, 10, 23, 1, 5, 60};
        for (int request : requests) {
            handler.handleRequest(request);
        }
    }
}
