package atari.games.tictactoe.player;

import atari.games.tictactoe.Board;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.ImagePattern;

public class Human extends Player {

  @Override
  public static void play() {
    this.setOnMouseClicked((MouseEvent me) -> {
      Image img = new Image("/atari/games/tictactoe/images/" + (Board.getNextPlayer() == 0 ? "x.jpg" : "o.jpg"));
      this.setFill(new ImagePattern(img));
    });
  }

}
