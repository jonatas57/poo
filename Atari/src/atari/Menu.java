package atari;

import javafx.scene.layout.GridPane;

public class Menu extends GridPane {

  public Menu(Button ...buttons) {
    super();
    for (int i = 0;i < buttons.length;i++) {
      super.add(buttons[i], 0, i);
    }
    super.setVgap(5);
    super.setMaxWidth(100);
    super.setMaxHeight(buttons.length * 35);
  }

  public void addButtons(Button... buttons) {
    super.getChildren().addAll(buttons);
  }
}
