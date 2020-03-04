package chapter23;

import org.junit.Test;

public class VisitorTest {
    @Test
    public void test(){
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new ConcreteElement());
        objectStructure.attach(new ConcreteElementB());

        ConcreteVisitor concreteVisitor = new ConcreteVisitor();
        ConcreteVisitorB concreteVisitorB = new ConcreteVisitorB();

        objectStructure.accept(concreteVisitor);
        objectStructure.accept(concreteVisitorB);
    }
}
