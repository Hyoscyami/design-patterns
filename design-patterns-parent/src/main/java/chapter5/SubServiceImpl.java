package chapter5;


import java.math.BigDecimal;

public class SubServiceImpl implements CalculateService {
    @Override
    public BigDecimal calculate(BigDecimal num1, BigDecimal num2) {
        return num1.subtract(num2);
    }
}
