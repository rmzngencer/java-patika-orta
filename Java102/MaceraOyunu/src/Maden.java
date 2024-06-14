
public class Maden extends BattleLoc {
    public Maden(Player player) {
        super(player,new Snake());
        setId(3);
        setName("Mağara");
    }

    @Override
    public void givePrize() {
        System.out.println("para kazandınız kazandınız");
        getPlayer().setMonay(getPlayer().getMonay()+10);

    }

    @Override
    public boolean onLocation() {
        System.out.print("ben şimdi madendesin ve canavarım "+ getObstacle().getName());
        askForCombat();

        return false;
    }
}
