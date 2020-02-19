package management.state;

import management.player.Player;

public interface Condition {

  void isInjuried(final Player player);
  void isNormalCondition(final Player player);

}
