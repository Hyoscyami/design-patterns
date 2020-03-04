package chapter18;

import org.junit.Test;
/**
 * @Author xusf
 * @Date 2020/3/1 12:06
 * @Description : 命令模式
 */
public class CommandTest {
    @Test
    public void test() {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.excuteCommand();
    }

}
