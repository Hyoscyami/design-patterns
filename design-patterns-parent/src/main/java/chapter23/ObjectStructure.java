package chapter23;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<Element> list = new ArrayList<>();

    public void attach(Element element){
        list.add(element);
    }
    public void detach(Element element){
        list.remove(element);
    }
    public void accept(Visitor visitor){
        for (Element element : list){
            element.accept(visitor);
        }
    }
}
