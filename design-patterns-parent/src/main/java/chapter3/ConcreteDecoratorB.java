package chapter3;

public class ConcreteDecoratorB extends Decorator{
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("ConcreteDecoratorB开始装饰了Decorator的operation方法");
        super.operation();
        System.out.println("ConcreteDecoratorB装饰结束了Decorator的operation方法");
    }
}
