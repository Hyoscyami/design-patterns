package chapter5;

import java.math.BigDecimal;

public interface CalculateService {
    /**
     * 计算方法接口
     * @param num1
     * @param num2
     * @return
     */
    BigDecimal calculate(BigDecimal num1, BigDecimal num2);
}
