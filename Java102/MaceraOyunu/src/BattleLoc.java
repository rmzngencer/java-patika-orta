public abstract class BattleLoc extends Location {

    private Obstacle obstacle;

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public BattleLoc(Player player, Obstacle obstacle) {
        super(player);
        this.obstacle = obstacle;
    }

    @Override
    public abstract boolean onLocation();
    public void combat(){
        System.out.println("Savaş başladı");
        if (getObstacle().getHealth()<=0){
            System.out.print(getObstacle().getName()+" öldü");
        }else {
            getObstacle().setHealth(getObstacle().getHealth() - getPlayer().getDamage());

        }

    }
}
