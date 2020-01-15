package chapter1.service.impl;

import chapter1.service.CalculateService;

import java.math.BigDecimal;

public class AddServiceImpl implements CalculateService {
    @Override
    public BigDecimal calculate(BigDecimal num1, BigDecimal num2) {
        return num1.add(num2);
    }
}
