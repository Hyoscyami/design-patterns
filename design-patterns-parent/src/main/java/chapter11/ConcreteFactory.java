package chapter11;
/**
 * @Author xusf
 * @Date 2020/2/23 16:24
 * @Description : 抽象工厂实现
 */
public class ConcreteFactory implements AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB();
    }
}
