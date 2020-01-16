package chapter4;

import org.junit.Test;

/**
* @Author xusf
* @Date 2020/1/16 14:39
* @Description : 代理模式
*/
public class ProxyTest {
    @Test
    public void test(){
        SchoolGirl schoolGirl = new SchoolGirl();
        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveFlowers();
    }
}
