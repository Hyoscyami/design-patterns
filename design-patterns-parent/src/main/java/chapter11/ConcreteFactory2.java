package chapter11;

public class ConcreteFactory2 implements AbstractFactory{
    /**
     * 创建产品A
     *
     * @return
     */
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    /**
     * 创建产品B
     *
     * @return
     */
    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
