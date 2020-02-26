package management.strategy;

public class DefenderPlayStrategy implements PlayStrategy {

  @Override
  public void play() {
    System.out.println("상대방 forward를 수비합니다");
  }

}
