package chapter21;

public class UnSharedConcreteFlyweight implements Flyweight{
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("UnSharedConcreteFlyweight的operation，extrinsicstate:" + extrinsicstate);
    }
}
