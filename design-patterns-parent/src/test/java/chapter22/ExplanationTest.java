package chapter22;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
/**
 * @Author xusf
 * @Date 2020/3/5 0:16
 * @Description : 解释器模式测试
 */
public class ExplanationTest {
    @Test
    public void test(){
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NoTerminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression abstractExpression : list){
            abstractExpression.interpret(context);
        }
    }
}
