public class Forest extends BattleLoc{
    public Forest(Player player) {
        super(player, new Vampire());
        setName("Forest");
        setId(4);
    }

    @Override
    public boolean onLocation() {
        System.out.print("şimdi  ormandasınzı ve canavarınnız: "+getObstacle().getName());
        return true;
    }




}
