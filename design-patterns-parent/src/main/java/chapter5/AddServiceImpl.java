package chapter5;

import java.math.BigDecimal;

public class AddServiceImpl implements CalculateService{
    /**
     * 计算方法接口
     *
     * @param num1
     * @param num2
     * @return
     */
    @Override
    public BigDecimal calculate(BigDecimal num1, BigDecimal num2) {
        return num1.add(num2);
    }
}
