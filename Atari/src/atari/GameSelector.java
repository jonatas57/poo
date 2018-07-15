package atari;

import atari.games.Game;

public class GameSelector extends Menu {
  
  public GameSelector(Game ...games) {
    super();
    for (Game game : games) {
      Button btn = new Button(game, game.getClass().getSimpleName());
      super.addButtons(btn);
    }
  }
}
