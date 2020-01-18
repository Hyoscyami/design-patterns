package chapter6;
/**
* @Author xusf
* @Date 2020/1/17 11:32
* @Description : 深复制
*/
public class Department implements Cloneable{
    private String name;
    private Person person;

    public Department(String name, Person person) {
        this.name = name;
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    protected Department clone(){
        Department department = null;
        try {
            department = (Department)super.clone();
            department.person = person.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return department;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", person=" + person +
                '}';
    }
}
