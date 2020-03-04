package chapter22;

public class NoTerminalExpression implements AbstractExpression{
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
