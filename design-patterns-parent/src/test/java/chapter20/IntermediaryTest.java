package chapter20;

import chapter9.ConcreteBuilderA;
import chapter9.ConcreteBuilderB;
import org.junit.Test;

/**
 * @Author xusf
 * @Date 2020/3/4 19:57
 * @Description : 中介者模式测试
 */
public class IntermediaryTest {
    @Test
    public void test(){
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague concreteColleague = new ConcreteColleague(mediator);
        ConcreteColleagueB concreteColleagueB = new ConcreteColleagueB(mediator);

        mediator.setConcreteColleague(concreteColleague);
        mediator.setConcreteColleagueB(concreteColleagueB);

        concreteColleague.send("你好！");
        concreteColleagueB.send("嗯，我很好！");
    }
}
