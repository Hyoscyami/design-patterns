package chapter3;

public class ConcreteDecoratorA extends Decorator{
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    /**
     * 调用这个方法的时候，传进来的component如果是第一次进行装饰，就是像ConcreteComponent的子类，然后这个super就是调用最核心最原始的那个方法
     * 如果是已经被装饰过的话，传进来的就是Decorator子类，然后这个super调用的就是被装饰过的方法
     */
    @Override
    public void operation() {
        System.out.println("ConcreteDecoratorA开始装饰了Decorator的operation方法");
        super.operation();
        System.out.println("ConcreteDecoratorA装饰结束了Decorator的operation方法");
    }
}
