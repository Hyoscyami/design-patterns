package chapter2;

public class Context {
    private CalculateStrategy calculateStrategy;
    public Context(CalculateStrategy calculateStrategy){
        this.calculateStrategy = calculateStrategy;
    }
    public Context(final String operator){
        switch (operator){
            case "+": calculateStrategy = new AddStrategy();break;
            case "-" : calculateStrategy = new SubStrategy();break;
            default: calculateStrategy = new AddStrategy();
        }
    }
    public void calculate(){
        calculateStrategy.calculate();
    }
}
