package chapter3;

import java.util.Objects;

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
