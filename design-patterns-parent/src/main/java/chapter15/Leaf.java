package chapter15;

public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("叶子节点不能添加");
    }

    @Override
    public void remove(Component component) {
        System.out.println("叶子节点不能删除");
    }

    @Override
    public void display(int depth) {
        System.out.println("-" + depth + name);
    }
}
