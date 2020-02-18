package management.singleton;

import management.decorator.*;
import management.player.Defender;
import management.player.Forward;
import management.player.MidFielder;
import management.player.Player;
import management.strategy.DefenderPlayStrategy;
import management.strategy.ForwardPlayStrategy;
import management.strategy.MidFielderPlayStrategy;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

  private static Manager manager;
  private ArrayList<Player> players = new ArrayList<>();
  private String name, position;
  private int age, number;

  Scanner scanner = new Scanner(System.in);

  public static Manager getInstance() {
    if (manager == null) {
      manager = new Manager();
    }

    return manager;
  }

  public void addPlayer(final Player player) {
    players.add(player);
  }

  public void management() {
    System.out.print("등록할 선수의 이름을 입력하시오.  ");
    name = scanner.next();
    System.out.print("등록할 선수의 나이를 입력하시오.  ");
    age = scanner.nextInt();
    System.out.print("등록할 선수의 번호를 입력하시오.  ");
    number = scanner.nextInt();
    System.out.print("등록할 선수의 포지션을 입력하시오.  ");
    position = scanner.next();

    if (position.equals("forward")) {
      addPlayer(new Forward(name, age, number, position));
    } else if (position.equals("defender")) {
      addPlayer(new Defender(name, age, number, position));
    } else if (position.equals("midfileder"))
      addPlayer(new MidFielder(name, age, number, position));
  }

  public void order(final String name, final int number, final String playStrategy) {
    for (Player p : players) {
      if (p.getName().equals(name) && p.getNumber() == number) {
        switch (playStrategy) {
          case "forward":
            p.setPlayStrategy(new ForwardPlayStrategy());
            System.out.println("공격 임무 지시 완료");
            break;
          case "mid":
            p.setPlayStrategy(new MidFielderPlayStrategy());
            System.out.println("경기조율 임무 지시 완료");
            break;
          case "defend":
            p.setPlayStrategy(new DefenderPlayStrategy());
            System.out.println("수비 임무 지시 완료");
            break;
          default:
            break;
        }
      }
    }
  }

  public void searchPlayer(final String name) {
    for (Player p : players) {
      if (p.getName().equals(name)) {
        System.out.println("선수이름: " + p.getName());
        System.out.println("선수나이: " + p.getAge());
        System.out.println("선수번호: " + p.getNumber());
        System.out.println("선수 포지션: " + p.getPosition());
        p.play();
      }
    }
  }

  public void train(String name, int trainingName) {
    for (Player p : players) {
      if (p.getName().equals(name)) {
        switch (trainingName) {
          case 1:
            p.setTraining(new PassTrainingDecorator(new PhysicalTraining()));
            p.doTraining();
            break;
          case 2:
            p.setTraining(new DribbleTrianingDecorator(new PhysicalTraining()));
            p.doTraining();
            break;
          case 3:
            p.setTraining(new PassTrainingDecorator(new DribbleTrianingDecorator(new PhysicalTraining())));
            p.doTraining();
            break;
          default:
            break;
        }
      }
    }
  }

}