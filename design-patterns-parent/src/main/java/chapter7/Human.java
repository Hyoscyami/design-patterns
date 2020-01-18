package chapter7;
/**
* @Author xusf
* @Date 2020/1/17 14:42
* @Description : 模板模式
*/
public abstract class Human {
    protected void eat(){
//        相同的代码抽到父类，子类实现不同的细节
        System.out.println("都要喝水");
    }
}
