package chapter9;

import org.junit.Test;

/**
* @Author xusf
* @Date 2020/1/19 9:37
* @Description : 构造者模式
*/
public class ConstructTest {
    @Test
    public void test(){
        Director director = new Director();
        Builder b1 = new ConcreteBuilderA();
        Builder b2 = new ConcreteBuilderB();
//        构造最基础的产品
        director.construct(b1);
//        返回构造完成的产品
        Product product = b1.getProduct();
//        打印构造的过程
        product.show();
//        以下类似
        director.construct(b2);
        Product product1 = b2.getProduct();
        product1.show();
    }
}
