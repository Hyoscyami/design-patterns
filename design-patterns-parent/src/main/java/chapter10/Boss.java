package chapter10;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Subject {
    private List<Observer> list = new ArrayList<>();
    private String action;

    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyA() {
        for (Observer observer : list) {
            observer.update();
        }
    }
}
