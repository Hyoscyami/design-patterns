package chapter20;

public class ConcreteColleagueB extends Colleague{
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }
    public void send(String message){
        mediator.send(message,this);
    }
    public void notifyA(String message){
        System.out.println("ConcreteColleagueB的notifyA:" + message);
    }
}
