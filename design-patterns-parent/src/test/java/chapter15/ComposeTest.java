package chapter15;

import org.junit.Test;

/**
 * @Author xusf
 * @Date 2020/2/28 22:17
 * @Description : 组合模式测试
 */
public class ComposeTest {
    @Test
    public void test() {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite composite = new Composite("Composite x");
        composite.add(new Leaf("Leaf XA"));
        composite.add(new Leaf("Leaf XB"));

        root.add(composite);

        Composite composite1 = new Composite("Composite XY");
        composite1.add(new Leaf("XYA"));
        composite1.add(new Leaf("XYB"));

        composite.add(composite1);

        root.add(new Leaf("Leaf C"));

        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        root.display(1);
    }
}
