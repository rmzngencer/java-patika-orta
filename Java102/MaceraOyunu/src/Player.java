import java.util.Scanner;

public class Player {

    private String CharName;
    private String name;
    private Inventory inventory;
    private int health;
    private int damage;
    private int monay;
    private GameChar gameChar;


    public String getCharName() {
        return CharName;
    }

    public void setCharName(String charName) {
        CharName = charName;
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

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage+inventory.getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMonay() {
        return monay;
    }

    public GameChar getGameChar() {
        return gameChar;
    }

    public void setGameChar(GameChar gameChar) {
        this.gameChar = gameChar;
    }

    public void setMonay(int monay) {
        this.monay = monay;
    }

    public Player(String name) {
        this.name = name;
        inventory = new Inventory();
    }

    public void selectCharters() {
        GameChar[] characters = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Select a character: ");
        for(GameChar character : characters) {
            character.toPrint();
        }

        System.out.println("Bir karekter seçmelisin:");
        int selectChar = Game.scanner.nextInt();
        while(selectChar < 1 || selectChar > 3) {
            System.out.println("Geçersiz karakter seçimi. Lütfen tekrar seçin.");
            selectChar = Game.scanner.nextInt();
        }

        switch (selectChar) {
            case 1:
                initPlayer(characters[0]);
                this.gameChar = characters[0];
                break;
            case 2:
                initPlayer(characters[1]);
                this.gameChar= characters[1];
                break;
            case 3:
                initPlayer(characters[2]);
                this.gameChar= characters[2];

                break;
            default:
                initPlayer(characters[0]);
                this.gameChar= characters[2];
        }

    }

    public void initPlayer(GameChar gameChar){
        this.setCharName(gameChar.getName());
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMonay(gameChar.getMoney());
        this.setInventory(new Inventory());
    }


    public void toPrint(){
        System.out.println("karakteriniz : "+CharName+"\tHasarınız: "+getDamage()+"\tSağlığınız: "+health+"\tParanız: "+monay+"\tzırhınız: "+inventory.getArmor().getName()+"\tbloklama: "+inventory.getArmor().getProtect()+"\tsilahınız: "+inventory.getWeapon().getName());
    }
}
