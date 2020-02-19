package management.state;

import management.player.Player;

public class Inguery implements Condition{

  private static Inguery ingery = new Inguery();
  private Inguery(){}

  public static Inguery getInstance(){
    return ingery;
  }

  public void isInjuried(final Player player){
    System.out.println("부상 상태가 심각해졌습니다.");
  }

  public void isNormalCondition(final Player player){
    System.out.println("부상에서 회복되었습니다.");
    player.setCondition(Normal.getInstance());
  }

}
