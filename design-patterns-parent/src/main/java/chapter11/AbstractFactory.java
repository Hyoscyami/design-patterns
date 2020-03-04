package chapter11;
/**
 * @Author xusf
 * @Date 2020/2/23 16:27
 * @Description : 抽象工厂接口，产品A和产品B具体子类怎么搭配，就看抽象工厂实现类怎么搭配的咯
 */
public interface AbstractFactory {
    /**
     * 创建产品A
     * @return
     */
    AbstractProductA createProductA();

    /**
     * 创建产品B
     * @return
     */
    AbstractProductB createProductB();
}
