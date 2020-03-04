package chapter14;

import org.junit.Test;
/**
 * @Author xusf
 * @Date 2020/2/28 11:23
 * @Description : 备忘录模式
 */
public class MemoTest {
    @Test
    public void test(){
        Originator originator = new Originator();
        originator.setState("on");
        originator.show();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.setState("off");
        originator.show();
        originator.setMemento(caretaker.getMemento());
        originator.show();
    }
}
