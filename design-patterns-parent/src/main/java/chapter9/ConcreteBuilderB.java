package chapter9;

public class ConcreteBuilderB extends Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件B");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
