import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player);
        setName("Tool Store");
    }

    Weapons[] weapons = {
            new Weapons(1,"Gun", 2, 25),
            new Weapons(2,"sword", 3, 35),
            new Weapons(3, "Rifle", 7, 45)
    };
    Armors[] armors = {
            new Armors(1,"Light Armor", 1, 15),
            new Armors(2,"Medium Armor", 3, 25),
            new Armors(3,"Heavy Armor", 5, 40)
    };

    @Override
    public boolean onLocation() {
        System.out.println("You are in the Tool Store.");
        System.out.println("You can buy weapons and armors to increase your power.");
        menu();


        return true;
    }
    public void menu(){
        System.out.println("-----------this is menu-----------");
        System.out.println("pres which one you want to buy:");
        System.out.print("");
        System.out.println(">>>Weapons");
        for (Weapons weapon : weapons) {
            System.out.println("ID: " + weapon.getId() + " Name: " + weapon.getName() + " Damage: " + weapon.getDamage() + " Price: " + weapon.getPrice());
        }
        System.out.println(">>>Armors");
        for (Armors armor : armors) {
            System.out.println("ID: " + armor.getId()+3 + " Name: " + armor.getName() + " Protect: " + armor.getProtect() + " Price: " + armor.getPrice());
        }
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        switch (select){
            case 1:
                buy(armors[0]);
                break;
            case 2:
                buy(armors[1]);
                break;
            case 3:
                buy(armors[2]);
                break;
            case 4:
                buy(weapons[0]);
                break;
            case 5:
                buy(weapons[1]);
                break;
            case 6:
                buy(weapons[2]);
                break;
            case 0:
                break;
        }

    }
    public <T> void buy(T inventory){
        System.out.println("You have bought " + inventory.toString());

        if (inventory instanceof Armors){
            Armors armor = (Armors) inventory;
            getPlayer().getInventory().setArmorName(armor.getName());
            getPlayer().getInventory().setArmorDefence(armor.getProtect());
            getPlayer().setMonay(getPlayer().getMonay() - armor.getPrice());
        }else if (inventory instanceof Weapons){
            Weapons weapon = (Weapons) inventory;
            getPlayer().getInventory().setWeaponName(weapon.getName());
            getPlayer().getInventory().setWeaponDamage(weapon.getDamage());
            getPlayer().setMonay(getPlayer().getMonay() - weapon.getPrice());
        }
    }
}
class Weapons {
    int id;
    private String name;
    private int damage;
    private int price;

    public Weapons(int id, String name, int damage, int price) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class Armors {

    int id;
    private String name;
    private int defence;
    private int price;

    public Armors(int id, String name, int protect, int price) {
        this.id = id;
        this.name = name;
        this.defence = protect;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtect() {
        return defence;
    }

    public void setProtect(int protect) {
        this.defence = protect;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
