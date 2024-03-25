public class SafeHouse extends NormalLoc{


    public SafeHouse(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are in the Safe House.");
        System.out.println("Your health is full now.");
        getPlayer().setHealth(getPlayer().getOriginalHealth());
        return true;
    }
}
