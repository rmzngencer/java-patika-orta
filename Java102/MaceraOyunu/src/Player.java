public class Player {
    private String name;
    private İnventory inventory;
    private int health;
    private int damage;
    private int monay;

    //TODO: inventori direk buradan alabiliriz
    public Player(String name, İnventory inventory, int health, int damage, int monay) {
        this.name = name;
        this.inventory = inventory;
        this.health = health;
        this.damage = damage;
        this.monay = monay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public İnventory getInventory() {
        return inventory;
    }

    public void setInventory(İnventory inventory) {
        this.inventory = inventory;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMonay() {
        return monay;
    }

    public void setMonay(int monay) {
        this.monay = monay;
    }
}
