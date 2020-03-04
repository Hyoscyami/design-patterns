package chapter23;

public class ConcreteVisitor implements Visitor{
    @Override
    public void visitConcreteElement(ConcreteElement concreteElement) {
        System.out.println("ConcreteElement被ConcreteVisitor访问");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("ConcreteElementB被ConcreteVisitor访问");
    }
}
