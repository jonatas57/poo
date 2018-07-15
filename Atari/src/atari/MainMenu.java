package atari;

import javafx.application.Platform;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class MainMenu extends Menu {
  public MainMenu() {
    super(new Button(100, 30, Color.GREEN, "Play", (MouseEvent me) -> {
//      Atari.setAtualMenu(1);
    }), new Button(100, 30, Color.RED, "Exit", (MouseEvent me) -> {
      Platform.exit();
    }));
  }
}
