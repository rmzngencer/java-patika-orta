public class SafeHouse extends NormalLoc{


    public SafeHouse(Player player) {
        super(player);
        setName("Ev");
        setId(1);
    }

    @Override
    public boolean onLocation() {
        System.out.println("Şuan güvenli evdesin tadını çıkar");
        System.out.println("Sğlığın fullendi.");
        getPlayer().setHealth(getPlayer().getGameChar().getHealth());

        return true;
    }
}
