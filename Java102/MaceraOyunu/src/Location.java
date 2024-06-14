public abstract  class Location {
    private  int Id;
    private Player player;
    private String name;

   public Location(Player player){

       this.player = player;
    }
    abstract boolean onLocation();
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
