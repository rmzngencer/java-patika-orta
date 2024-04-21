import java.util.Scanner;

public class Game {


    public static Scanner scanner = new Scanner(System.in);
    public void StartGame() {


        System.out.println("Macera Oyununa Hoşgeldiniz");
        System.out.println("Oyuna başlamadan önce adınızı girmeyi unutmayın!!");
        //String playerName = scanner.nextLine();
        Player player = new Player("Player1");
        System.out.println("Merhaba " + player.getName() + " burada kaderini sen belirliyorsun. unutma, burda her kararın bir sonucu var.");
        player.selectCharters();
        Location[] locations = {new SafeHouse(player), new ToolStore(player), new Cave(player), new Forest(player), new River(player)};
        while (true){
            player.toPrint();
            System.out.println("»»»»Haritada Bulunan Lokasyonlar: ");
            for(Location location : locations) {
                System.out.println("»"+location.getId()+" -> "+location.getName());
            }

            System.out.println("Bir lokasyon seçmelisin:");
            int selectLoc = scanner.nextInt();
            while(selectLoc < 1 || selectLoc > 5) {
                System.out.println("Geçersiz lokasyon seçimi. güvenli bölgeye girsiniz.");
                selectLoc = scanner.nextInt();
            }

            switch (selectLoc) {
                case 1:
                    locations[0].onLocation();
                    break;
                case 2:
                    locations[1].onLocation();
                    break;
                case 3:
                    locations[2].onLocation();
                    break;
                case 4:
                    locations[3].onLocation();
                    break;
                case 5:
                    locations[4].onLocation();
                    break;
                default:
                    locations[0].onLocation();


            }

            if (player.getHealth()<=0) {
                System.out.println("Oyun bitti");
                break;
            }

        }




    }
}
