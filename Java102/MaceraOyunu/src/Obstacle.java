public class Obstacle {
    private String name;
    private int damage;

    public void setHealth(int health) {
        this.health = health;
    }

    public Obstacle(String name, int damage, int health, int award) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.award = award;
    }

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
