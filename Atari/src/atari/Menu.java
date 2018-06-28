package atari;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class Menu {
  GridPane menu;
  public Menu(Button ...buttons) {
    this.menu = new GridPane();
    int i = 0;
    for (Button btn : buttons) {
      StackPane button = btn.getButton();
      GridPane.setConstraints(button, i++, 0);
      menu.getChildren().add(button);
    }
  }
  
  public GridPane getMenu() {
    return this.menu;
  }
}
