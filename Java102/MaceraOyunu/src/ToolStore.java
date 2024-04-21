import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player);
        setName("Mağaza");
        setId(2);

    }

    Weapons[] weapons = {

            new Weapons(1,"Tabanca", 2, 15),
            new Weapons(2,"Kılıç", 3, 35),
            new Weapons(3, "Tüfek", 7, 45)
    };
    Armors[] armors = {
            new Armors(1,"fif zırh", 1, 15),
            new Armors(2,"orta zırh", 3, 25),
            new Armors(3,"ağır zırh", 5, 40)
    };

    @Override
    public boolean onLocation() {
        System.out.println("Şimdi mağazadasın");
        System.out.println("Unutma güçlenmek her zaman gereken bir öelliktir");
        menu();


        return true;
    }
    public void menu(){
        System.out.println("-----------Mağazaya hoş geldiniz-----------");

        boolean showMenu = true;
        while (showMenu){
            System.out.println("Hangisini satın almak istiyorsan tseç:");
            System.out.print("");
            System.out.println(">>> silahlar __________________");
            for (Weapons weapon : weapons) {
                System.out.println("ID: " + weapon.getId() + " ISim: " + weapon.getName() + " Hasar: " + weapon.getDamage() + " Fiyat: " + weapon.getPrice());
            }
            System.out.println(">>>Kalkanlar __________________");
            for (Armors armor : armors) {
                System.out.println("ID: " + (armor.getId()+3) + " Isim: " + armor.getName() + " koruma seviyesi: " + armor.getProtect() + " Fiyat: " + armor.getPrice());
            }
            System.out.println("«««««««««  0- Çıkış  «««««««««");
            int select = Game.scanner.nextInt();
            switch (select){
                case 1:
                    buy(weapons[0]);
                    break;
                case 2:
                    buy(weapons[1]);
                    break;
                case 3:
                    buy(weapons[2]);
                    break;
                case 4:
                    buy(armors[0]);
                    break;
                case 5:
                    buy(armors[1]);
                    break;
                case 6:
                    buy(armors[2]);
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor");
                    showMenu = false;
                    break;
            }
        }

    }
    public void buy(Product prucult){
        if (isMoneyEnough(prucult.getPrice())){
            if (getPlayer().getInventory().getArmor() != null && prucult instanceof Armors) {
                System.out.println("Zaten bir zırhınız var. Değiştirmek ister misiniz?");
                System.out.print(getPlayer().getInventory().getArmor().getName());
            }else if (getPlayer().getInventory().getWeapon() != null && prucult instanceof Weapons){
                System.out.println("Zaten bir silahınız var. Değiştirmek ister misiniz?");
                System.out.print(getPlayer().getInventory().getWeapon().getName());
            }else {
                System.out.println("satın alınsın mı ?");
            }
            System.out.println("1- Evet 2- Hayır");
            int select = Game.scanner.nextInt();
            if (select == 1){
                getPlayer().setMonay(getPlayer().getMonay() - prucult.getPrice());
                if (prucult instanceof Weapons){
                    getPlayer().getInventory().setWeapon(((Weapons) prucult));
                    System.out.println("Yeni silahınız: "+prucult.getName());
                }else if (prucult instanceof Armors) {
                    System.out.println("Yeni zırhınız: "+prucult.getName());
                    getPlayer().getInventory().setArmor(((Armors) prucult));
                }
            }else{
                System.out.println("Satın alınmadı");
            }

        }

    }
    public boolean isMoneyEnough(int price){
        if (getPlayer().getMonay() >= price){
            return true;
        }
        System.out.println("Yetersiz bakiye");
        return false;
    }
}

class Product {
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
class Weapons extends Product{
    private int damage;
    public Weapons(int id, String name, int damage, int price) {
       super(id, name, price);
        this.damage = damage;

    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

class Armors extends Product {

    private int defence;

    public Armors(int id, String name, int protect, int price) {
        super(id, name, price);
        this.defence = protect;

    }

    public int getProtect() {
        return defence;
    }

    public void setProtect(int protect) {
        this.defence = protect;
    }

}