public class Obstacle {
    private String name;
    private int damage;
    private int health;
    private int award;



    public void reduceHealth(int damage) {
        this.health -= damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getAward() {
        return award;
    }
}
