package chapter4;

public class Proxy implements GiveGift{
    private Pursuit pursuit;

    public Proxy(SchoolGirl girl) {
        this.pursuit = new Pursuit(girl);
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }
}