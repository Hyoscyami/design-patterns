package chapter7;

public class Woman extends Human {
    @Override
    protected void eat() {
        super.eat();
        System.out.println("我要吃馒头");
    }
}
