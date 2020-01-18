package chapter8;

public class Facade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;

    public Facade(){
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
    }

    /**
     * 其实外观模式没什么好说的，就是提供一个简单易用的接口给调用方，不要把太多职责交给调用方，比如方法调用顺序等
     */
    public void method(){
        subSystemOne.method();
        subSystemTwo.method();
    }
}
