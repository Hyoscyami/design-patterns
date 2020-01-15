package chapter2;

import java.math.BigDecimal;

public class AddStrategy implements CalculateStrategy{
    @Override
    public void calculate() {
        System.out.println("加法策略");
    }
}
