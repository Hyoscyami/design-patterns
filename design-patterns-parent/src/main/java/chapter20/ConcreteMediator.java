package chapter20;

public class ConcreteMediator extends Mediator{
    private ConcreteColleague concreteColleague;
    private ConcreteColleagueB concreteColleagueB;

    public void setConcreteColleague(ConcreteColleague concreteColleague) {
        this.concreteColleague = concreteColleague;
    }

    public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
        this.concreteColleagueB = concreteColleagueB;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == concreteColleague){
            concreteColleagueB.notifyA(message);
        }else {
            concreteColleague.notifyA(message);
        }
    }
}
