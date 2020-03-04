package chapter23;

public class ConcreteElement implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElement(this);
    }
}
