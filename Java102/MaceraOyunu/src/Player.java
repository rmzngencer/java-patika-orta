import java.util.Scanner;

public class Player {
    private String ID;
    private String name;
    private Inventory inventory;
    private int health;

    private int originalHealth;
    private int damage;
    private int monay;


    public Player(String ID, String name, Inventory inventory, int health,int originalHealth, int damage, int monay) {
        this.ID = ID;
        this.name = name;
        this.health = health;
        this.originalHealth = originalHealth;
        this.damage = damage;
        this.monay = monay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getHealth() {
        return health;
    }
    public int getOriginalHealth() {
        return originalHealth;
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

    @Override
    public String toString() {
        return super.toString();
    }

    public static Player selectCharacter(){
        System.out.println("Select your character: ");
        System.out.println("1. Knight");
        System.out.println("2. Archer");
        System.out.println("3. Samurai");

        Scanner scanner = new Scanner(System.in);
        String character = scanner.nextLine();

        switch (character){
            case "1":
                System.out.println("You have selected Knight");
                return new Knight();

            case "2":
                System.out.println("You have selected Archer");
                return new Archer();
            case "3":
                System.out.println("You have selected Samurai");
                return new Samurai();
            default:
                return null;
        }

    }

}
