package chapter21;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,Object> map = new HashMap<>();
    public FlyweightFactory(){
        map.put("x",new ConcreteFlyweight());
        map.put("y",new ConcreteFlyweight());
        map.put("z",new ConcreteFlyweight());
    }
    public Flyweight getFlyweight(String key){
        return (Flyweight) map.get(key);
    }
}
