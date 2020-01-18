package chapter8;

import org.junit.Test;

/**
 * @Author xusf
 * @Date 2020/1/18 10:27
 * @Description :外观模式，也叫门面模式
 */
public class FacadeTest {
    /**
     * 其实外观模式没什么好说的，就是提供一个简单易用的接口给调用方，不要把太多职责交给调用方，比如方法调用顺序等
     */
    @Test
    public void test() {
        Facade facade = new Facade();
        facade.method();
    }
}
