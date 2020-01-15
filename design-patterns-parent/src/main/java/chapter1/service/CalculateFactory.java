package chapter1.service;

import chapter1.service.impl.AddServiceImpl;
import chapter1.service.impl.SubServiceImpl;
/**
* @Author xusf
* @Date 2020/1/15 10:06
* @Description : 这种方式违反了开放封闭原则，不建议使用，如果一定要用，可以用反射
*/
public class CalculateFactory {
    public static CalculateService createCalculate(final String operator){
        CalculateService calculateService;
        switch (operator){
            case "+" : calculateService = new AddServiceImpl();break;
            case "-" : calculateService = new SubServiceImpl();break;
            default: calculateService = new AddServiceImpl();
        }
        return calculateService;
    }
}
