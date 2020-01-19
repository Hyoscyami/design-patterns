package chapter9;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<String> parts = new ArrayList<>();

    public List<String> getParts() {
        return parts;
    }

    public void setParts(List<String> parts) {
        this.parts = parts;
    }
    public void add(String part){
        parts.add(part);
    }

    /**
     * 查看创建产品的过程
     */
    public void show(){
        System.out.println("----开始创建产品----");
        for (String part : parts){
            System.out.println("创建：" + part);
        }
        System.out.println("----创建完毕----");
    }
}
