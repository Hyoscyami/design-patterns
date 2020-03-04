package chapter13;

import org.junit.Test;

/**
 * @Author xusf
 * @Date 2020/2/27 21:22
 * @Description : 适配器测试
 */
public class AdapterTest {
    @Test
    public void test(){
        Target target = new Adapter();
        target.request();
    }
}
