public abstract class NormalLoc extends Location {


    public NormalLoc(Player player) {
        super( player);
    }

    @Override
    abstract boolean onLocation();


}
