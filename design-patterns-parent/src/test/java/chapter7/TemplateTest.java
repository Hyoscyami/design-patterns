package chapter7;

import org.junit.Test;

/**
 * @Author xusf
 * @Date 2020/1/17 14:44
 * @Description : 模板模式
 */
public class TemplateTest {
    @Test
    public void test() {
        Man man = new Man();
        man.eat();
        Woman woman = new Woman();
        woman.eat();
    }
}
