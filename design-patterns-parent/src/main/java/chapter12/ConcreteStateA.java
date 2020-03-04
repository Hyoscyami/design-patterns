package chapter12;

public class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        System.out.println("开始执行ConcreteStateA的handle方法");
        context.setState(new ConcreteStateB());
    }
}
