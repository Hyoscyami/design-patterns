package chapter11;

public class ReflectFactory {
    private static final String FACTORY_NAME = "chapter11.ConcreteFactory";
    public static AbstractFactory createFactory() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (AbstractFactory) Class.forName(FACTORY_NAME).newInstance();
    }
}
