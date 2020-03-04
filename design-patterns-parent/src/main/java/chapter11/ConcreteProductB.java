package chapter11;

public class ConcreteProductB implements AbstractProductB{
    /**
     * 打印产品名
     */
    @Override
    public void product() {
        System.out.println("我是产品B");
    }
}
