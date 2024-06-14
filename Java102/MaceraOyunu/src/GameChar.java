public class GameChar {
    private int Id;
    private String name;
    private int damage;
    private int health;
    private int money;

    public GameChar(int Id, String name, int damage, int health, int money) {
        this.Id = Id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.money = money;
    }

    public void toPrint(){
        System.out.println("Karakter: "+Id+"\tName: "+name+"\tDamage: "+damage+"\tHealth: "+health+"\tMoney: "+money);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }



}
