package chapter10;

public interface Subject {
    void add(Observer observer);
    void delete(Observer observer);
    void notifyA();
}
