package management.state;

import management.player.Player;

public class Ingery implements Condition{

  private static Ingery ingery = new Ingery();
  private Ingery(){}

  public static Ingery getInstance(){
    return ingery;
  }

  public void isInjuried(Player player){
    System.out.println("부상 상태가 심각해졌습니다.");
  }

  public void isNormalCondition(Player player){
    System.out.println("부상에서 회복되었습니다.");
    player.setCondition(Normal.getInstance());
  }

}
