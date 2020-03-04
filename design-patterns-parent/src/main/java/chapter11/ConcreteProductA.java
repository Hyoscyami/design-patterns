package chapter11;

public class ConcreteProductA implements AbstractProductA{
    /**
     * 打印产品名
     */
    @Override
    public void product() {
        System.out.println("我是产品A");
    }
}
