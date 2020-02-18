package management.state;

import management.player.Player;

public interface Condition {

  void isInjuried(Player player);
  void isNormalCondition(Player player);

}
