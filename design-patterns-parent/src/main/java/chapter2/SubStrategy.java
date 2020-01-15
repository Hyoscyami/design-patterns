package chapter2;

import java.math.BigDecimal;

public class SubStrategy implements CalculateStrategy {
    @Override
    public void calculate() {
        System.out.println("减法策略");
    }
}
