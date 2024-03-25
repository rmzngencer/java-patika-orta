public abstract class BattleLoc extends Location {

    private Obstacle obstacle;

    public BattleLoc(Obstacle obstacle) {
        super();
        this.obstacle = obstacle;
    }

    @Override
    public boolean onLocation() {
        return true;
    }
    public void combat(){
        System.out.println("Savaş başladı");
    }
}
