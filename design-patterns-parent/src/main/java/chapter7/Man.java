package chapter7;

public class Man extends Human{
    @Override
    protected void eat() {
        super.eat();
        System.out.println("我要吃饭");
    }
}
