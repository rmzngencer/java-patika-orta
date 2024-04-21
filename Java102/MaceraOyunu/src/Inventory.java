public class Inventory {
    private boolean water;
    private boolean food;
    private boolean firewood;
    private  Weapons weapon=new Weapons(0,"yumruk", 0, 0);
    private Armors armor =  new Armors(0,"tişört", 0, 0);;

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armors armor) {
        this.armor = armor;
    }

    public Armors getArmor() {
        return armor;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }


}

