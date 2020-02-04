package management;

import java.util.Scanner;

public class Main {

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        ManagementMenu managementMenu = new ManagementMenu();
        SearchPlayer searchPlayer = new SearchPlayer();
        Player[] player = new Player[20];

        int choice, age, number;
        String name, position, playerName;
        int count = 0;

        managementMenu.menu();
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("조회하실 선수의 이름을 입력하세요.");
                playerName = scanner.next();
                searchPlayer.search(playerName);
                System.out.println(player[count].getAge());
                System.out.println(player[count].getPosition());
            case 2:
                System.out.print("등록할 선수의 이름을 입력하시오.  ");
                name = scanner.next();
                System.out.print("등록할 선수의 나이를 입력하시오.  ");
                age = scanner.nextInt();
                System.out.print("등록할 선수의 번호를 입력하시오.  ");
                number = scanner.nextInt();
                System.out.print("등록할 선수의 포지션을 입력하시오.  ");
                position = scanner.next();
                player[count] = new Player(name, age, number, position);
                count++;
            case 3:
                Role midFiledPlay = new MidFiledPlay(new DefenderPlay(new BasicRole()));
                midFiledPlay.role();
            case 4:
            case 5:
                break;
        }


        System.out.println();
//

        //Manager manager = Manager.getInstance();  //감독임명


    }
}
