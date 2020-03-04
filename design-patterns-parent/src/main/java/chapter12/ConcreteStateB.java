package chapter12;

public class ConcreteStateB implements State{
    @Override
    public void handle(Context context) {
        System.out.println("开始执行ConcreteStateB的handle方法");
        context.setState(new ConcreteStateA());
    }
}
