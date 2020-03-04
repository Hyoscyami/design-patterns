package chapter23;

public interface Visitor {
    void visitConcreteElement(ConcreteElement concreteElement);
    void visitConcreteElementB(ConcreteElementB concreteElementB);
}
