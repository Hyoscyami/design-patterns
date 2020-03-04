package chapter11;

import org.junit.Test;

public class AbstractFactoryTest {
    /**
     * 有缺点，每次都要先在调用前初始化哪个工厂，如果有一百个地方都是用的ConcreteFactory，现在要换成别的工厂，所用初始化工厂的地方都要替换
     * 这种情况可以用简单工厂，利用反射进行初始化，不用写死在代码
     */
    @Test
    public void test(){
        AbstractFactory abstractFactory = new ConcreteFactory();
//        AbstractFactory abstractFactory = new ConcreteFactory2();
        AbstractProductA abstractProductA = abstractFactory.createProductA();
        AbstractProductB abstractProductB = abstractFactory.createProductB();
        abstractProductA.product();
        abstractProductB.product();
    }

    /**
     * 利用反射进行初始化工厂，到时候改的话只要改反射工厂的初始化代码
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws ClassNotFoundException
     */
    @Test
    public void test2() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        AbstractFactory abstractFactory = ReflectFactory.createFactory();
        AbstractProductA abstractProductA = abstractFactory.createProductA();
        AbstractProductB abstractProductB = abstractFactory.createProductB();
        abstractProductA.product();
        abstractProductB.product();
    }
}
