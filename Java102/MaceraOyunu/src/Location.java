public abstract  class Location {
    private Player player;
    private String name;
    abstract boolean onLocation();
   public Location( Player player){
       this.name = name;
       this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
