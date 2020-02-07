package chapter10;

public class StockObserver extends Observer{
    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println("开始更新:" + name);
    }
}
