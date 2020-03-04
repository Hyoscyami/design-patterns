package chapter17;

public class RefinedAbstraction extends Abstraction{
    @Override
    public void operation(){
        implementor.operation();
    }
}
