package chapter3;

public class ConcreteDecoratorA extends Decorator{
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("ConcreteDecoratorA开始装饰了Decorator的operation方法");
        super.operation();
        System.out.println("ConcreteDecoratorA装饰结束了Decorator的operation方法");
    }
}
