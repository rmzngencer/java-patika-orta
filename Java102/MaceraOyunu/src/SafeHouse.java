public class SafeHouse extends NormalLoc{


    public SafeHouse(Player player) {
        super(player);
        setName("Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are in the Safe House.");
        System.out.println("Your health is full now.");
        getPlayer().setHealth(getPlayer().getOriginalHealth());
        return true;
    }
}
