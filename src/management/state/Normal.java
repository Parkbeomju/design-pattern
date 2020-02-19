package management.state;

import management.player.Player;

public class Normal implements Condition {

  private static Normal normal = new Normal();
  private Normal(){}

  public static Normal getInstance(){
    return normal;
  }

  public void isInjured(final Player player){
    System.out.println("부상을 당한 상태가 됩니다");
    player.setCondition(Injury.getInstance());
  }

  public void isNormalCondition(final Player player){
    System.out.println("부상을 당한 상태가 아닙니다.");
  }

}
