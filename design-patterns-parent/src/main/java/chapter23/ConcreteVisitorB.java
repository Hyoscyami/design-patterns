package chapter23;

public class ConcreteVisitorB implements Visitor{
    @Override
    public void visitConcreteElement(ConcreteElement concreteElement) {
        System.out.println("ConcreteElement被ConcreteVisitorB访问");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("ConcreteElementB被ConcreteVisitorB访问");
    }
}
