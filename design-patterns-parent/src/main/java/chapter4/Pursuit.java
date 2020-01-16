package chapter4;

public class Pursuit implements GiveGift {
    private SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    @Override
    public void giveFlowers() {
        System.out.println("pursuit送花给:" + schoolGirl.getName());
    }
}
