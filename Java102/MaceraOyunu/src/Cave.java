public class Cave extends BattleLoc {
    public Cave(Player player) {
        super(player,new Zombie());
        setId(3);
        setName("Mağara");
    }

    @Override
    public boolean onLocation() {
        System.out.print("ben şimdi Mağaradayım ve canavarım "+ getObstacle().getName());
        return false;
    }
}
