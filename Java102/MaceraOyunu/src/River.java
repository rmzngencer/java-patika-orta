public class River extends BattleLoc {
    public River(Player player) {
        super(player, new Bear());
        setName("Nehir");
        setId(5);
    }

    @Override
    public boolean onLocation() {
        System.out.print("şimdi nehirdesiniz ve canavarınız "+getObstacle().getName());
        return false;
    }
    @Override
    public void givePrize() {
        System.out.println("Mağaradan çıktınız ve su kazandınız");


        getPlayer().getInventory().setWater(true);

    }
}
