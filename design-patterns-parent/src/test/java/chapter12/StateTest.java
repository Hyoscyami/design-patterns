package chapter12;

import org.junit.Test;

/**
 * @Author xusf
 * @Date 2020/2/27 20:55
 * @Description : 状态模式
 */
public class StateTest {
    @Test
    public void test(){
        Context context = new Context(new ConcreteStateA());
        context.change();
        context.change();
    }
}
