package management;

import management.singleton.Manager;

import java.util.Scanner;

public class Main {

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        ManagementMenu managementMenu = new ManagementMenu();
        Manager manager = Manager.getInstance();

        int choice, playerNumber, trianingChoice;
        String playerName, playStrategy;
        boolean status = true;

        while (status) {
            managementMenu.menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("조회하실 선수의 이름을 입력하세요.");
                    playerName = scanner.next();
                    manager.searchPlayer(playerName);
                    break;
                case 2:
                    manager.management();
                    break;
                case 3:
                    System.out.println("임무를 부여받을 선수이름을 입력하세요.");
                    playerName = scanner.next();
                    System.out.println("선수 번호도 입력해주세요.");
                    playerNumber = scanner.nextInt();
                    System.out.println("임무를 부여해주세요.");
                    playStrategy = scanner.next();
                    manager.order(playerName, playerNumber, playStrategy);
                    break;
                case 4:
                    System.out.println("훈련시킬 선수이름을 입력하세요.");
                    playerName = scanner.next();
                    System.out.println("어떤 훈련을 시킬까요?");
                    System.out.println("(기본훈련:체력) 1.패스 2.드리블 3.패스+드리블");
                    trianingChoice = scanner.nextInt();
                    manager.train(playerName, trianingChoice);
                    break;
                case 5:
                    System.out.println("고생하셨습니다.");
                    status = false;
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
            }
        }

    }

}