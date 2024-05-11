public class Cave extends BattleLoc {
    public Cave(Player player) {
        super(player,new Zombie());
        setId(3);
        setName("Mağara");
    }

    @Override
    public void givePrize() {
        System.out.println("yemek kazandınız");
        getPlayer().getInventory().setFood(true);

    }

    @Override
    public boolean onLocation() {
        System.out.print("ben şimdi Mağaradayım ve canavarım "+ getObstacle().getName());
        askForCombat();

        return false;
    }
}
