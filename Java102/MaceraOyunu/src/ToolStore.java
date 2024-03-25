public class ToolStore extends NormalLoc{
    public ToolStore(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are in the Tool Store.");
        System.out.println("You can buy weapons and armors to increase your power.");
        System.out.println("<1> Weapons");
        System.out.println("<2> Armors");
        System.out.println("<0> Exit");
        return true;
    }
    public void menu(){
        System.out.println("You are in the Tool Store.");
        System.out.println("You can buy weapons and armors to increase your power.");
        System.out.println("<1> Weapons");
        System.out.println("<2> Armors");
        System.out.println("<0> Exit");
    }
    public void buy(){
        System.out.println("You can buy weapons and armors to increase your power.");
        System.out.println("<1> Weapons");
        System.out.println("<2> Armors");
        System.out.println("<0> Exit");
    }
}
