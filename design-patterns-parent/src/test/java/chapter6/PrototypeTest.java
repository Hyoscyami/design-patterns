package chapter6;

import org.junit.Test;

/**
 * @Author xusf
 * @Date 2020/1/17 10:34
 * @Description : 原型模式
 */
public class PrototypeTest {
    /**
     * 最简单的原型模式，实现clone接口
     */
    @Test
    public void test() {
        Person person = new Person("张三");
        person.setPassword("123");
        System.out.println(person);
        Person person1 = person.clone();
        person1.setPassword("222");
        System.out.println(person);
        System.out.println(person1);
    }
    @Test
    public void test2(){
        Person person = new Person("战三");
        Department department = new Department("人事部",person);
        System.out.println(department);
        Department department1 = department.clone();
//        由于实现了深克隆，这里改了person的名字不会影响到department的person对象
        person.setName("李四");
        department1.setName("综合部");
        System.out.println(department1);
        System.out.println(department);
    }
}
