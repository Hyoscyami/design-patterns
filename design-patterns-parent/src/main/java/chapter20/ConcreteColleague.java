package chapter20;

public class ConcreteColleague extends Colleague{
    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }
    public void send(String message){
        mediator.send(message,this);
    }
    public void notifyA(String message){
        System.out.println("ConcreteColleague的notifyA:" + message);
    }
}
