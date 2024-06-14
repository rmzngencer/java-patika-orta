public class Forest extends BattleLoc{
    public Forest(Player player) {
        super(player, new Vampire());
        setName("Forest");
        setId(4);
    }
    @Override
    public void givePrize() {
        System.out.println("Mağaradan çıktınız ve odun kazandınız");
        getPlayer().getInventory().setFirewood(true);

    }

    @Override
    public boolean onLocation() {
        System.out.print("şimdi  ormandasınzı ve canavarınnız: "+getObstacle().getName());

        return true;
    }




}
