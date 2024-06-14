import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class BattleLoc extends Location {

    private Obstacle obstacle;
    private List<Obstacle> obstacleList;


    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacleList() {
        List<Obstacle> obstacles = new ArrayList<Obstacle>();
        for (int i = 0; i < numOfObstacles(); i++) {
            obstacles.add(obstacle);
        }
        this.obstacleList = obstacles;
    }

    public void askForCombat(){
        setObstacleList();
        System.out.println(obstacle.getName()+"  dolu bir mekanasınız \n karşınıza "+obstacleList.size()+" kadar "+obstacle.getName()+" çıktı");
        System.out.println("savaşmak ister misiniz? (e/h)");
        Scanner Scanner = new Scanner(System.in);
        String answer = Scanner.nextLine();
        if (answer.equals("e")){

            combat();
        }else {
            System.out.println("savaşmadınız");
        }
    }

    public BattleLoc(Player player, Obstacle obstacle) {
        super(player);
        this.obstacle = obstacle;
    }

    public int numOfObstacles(){
        Random random = new Random();
        return 1+random.nextInt(2);
    }
//0. indeks silindiğinde 1. indeks sıfır ile eşit oluyor
    public void hitObstacle(){
        if (getPlayer().getHealth()>=0){
            System.out.println(obstacle.getName()+ " vurdunuz ");
            if (getPlayer().getDamage()>=obstacleList.get(0).getHealth()){
                System.out.println(getObstacle().getName()+" öldü");
                obstacleList.remove(0);
                System.out.println("kalan canavar sayısı: "+obstacleList.size());
            }else {
                obstacleList.get(0).setHealth(obstacleList.get(0).getHealth() - getPlayer().getDamage());
                System.out.println(obstacleList.get(0).getHealth()+" canavarın canı kaldı");
            }
        }
    }
    public void getDamage(){
        if (!obstacleList.isEmpty()){
            System.out.println(obstacle.getName()+" size vurdu");
            if (getObstacle().getDamage()>=getPlayer().getHealth()){
                System.out.println("Öldünüz");
                getPlayer().setHealth(0);
            }else {
                getPlayer().setHealth(getPlayer().getHealth()-getObstacle().getDamage());
                System.out.println(obstacle.getName()+" size verdiği hasar: "+getObstacle().getDamage());
                System.out.println("kalan canınız: "+getPlayer().getHealth());
            }
        }

    }

    public abstract void givePrize();

    public void result(){
        if (getPlayer().getHealth()>0 && obstacleList.isEmpty()){
            givePrize();
        }else {
            System.out.println("Kaybettiniz");

        }
    }

    @Override
    public abstract boolean onLocation();



    public void combat(){
        System.out.println("Savaş başladı");
        Random myRand = new Random();
        int randomInteger = myRand.nextInt(2);
        while (getPlayer().getHealth()>0 && !obstacleList.isEmpty()){
            if (randomInteger == 0){
                hitObstacle();
                getDamage();
            }else {
                getDamage();
                hitObstacle();
            }
        }
        result();

    }
}
