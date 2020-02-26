package management.state;

import management.player.Player;

public class Injury implements Condition {

  private static Injury ingery = new Injury();

  private Injury() {
  }

  public static Injury getInstance() {
    return ingery;
  }

  public void isInjured(final Player player) {
    System.out.println("부상 상태가 심각해졌습니다.");
  }

  public void isNormalCondition(final Player player) {
    System.out.println("부상에서 회복되었습니다.");
    player.setCondition(Normal.getInstance());
  }

}
