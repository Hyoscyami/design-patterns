package chapter9;
/**
* @Author xusf
* @Date 2020/1/19 9:41
* @Description : 指挥者类，用来设置构建顺序的
*/
public class Director {
    /**
     * 其中一种组装方式
     * @param builder
     */
    public void construct(Builder builder){
//        具体组装细节由Builder子类实现
        builder.buildPartA();
        builder.buildPartB();
    }
}
