package chapter19;

import java.util.Objects;

public class ConcreteHandlerB extends Handler{
    @Override
    public void handleRequest(int request) {
        if (request >= 10) {
            System.out.println("ConcreteHandlerB处理大小为:" + request + "成功");
        }else if (Objects.nonNull(successor)){
//            下一个来看看是否能处理
            successor.handleRequest(request);
        }
    }
}
