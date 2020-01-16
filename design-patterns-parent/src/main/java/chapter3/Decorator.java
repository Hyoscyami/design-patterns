package chapter3;

import java.util.Objects;
/**
* @Author xusf
* @Date 2020/1/16 14:04
* @Description : Component作为抽象类，ConcreteComponent作为最原始最核心的实现，而Decorator就作为装饰模式的抽象类，需要有一个Component实例属性
*/
public abstract class Decorator extends Component{
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (Objects.nonNull(component)){
            component.operation();
        }
    }
}
