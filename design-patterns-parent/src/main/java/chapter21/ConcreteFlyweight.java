package chapter21;

public class ConcreteFlyweight implements Flyweight{
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("ConcreteFlyweight的operation方法，extrinsicstate:" + extrinsicstate);
    }
}
