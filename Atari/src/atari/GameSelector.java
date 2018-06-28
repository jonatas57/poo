package atari;

import atari.games.Game;
import javafx.collections.ObservableList;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

public class GameSelector extends Menu {
  private static ObservableList<Game> games;
  public GameSelector() {
    games.forEach((item) -> {
      StackPane btn = new Button().getButton();
      btn.setOnMouseClicked((MouseEvent me) -> {
        item.startGame();
      });
    });
  }
  
  public ObservableList<Game> getGames() {
    return GameSelector.games;
  }
}
