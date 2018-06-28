package atari;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Button {

  private StackPane btn;
  private Rectangle background, lightMask;
  private Text text;

  public Button() {
    this(100, 20, Color.color(0, 0.9, 0.3), "Button");
  }

  public Button(String txt) {
    this(100, 20, Color.color(0, 0.9, 0.3), txt);
  }

  public Button(Paint fill, String txt) {
    this(100, 20, fill, txt);
  }

  public Button(double width, double height, Paint fill, String txt) {
    btn = new StackPane();

    background = new Rectangle(width, height, fill);
    background.setArcWidth(0.1 * width);
    background.setArcHeight(background.getArcWidth());

    lightMask = new Rectangle(width, height, Color.color(1, 1, 1, 0.2));
    lightMask.setArcWidth(0.1 * width);
    lightMask.setArcHeight(lightMask.getArcWidth());
    lightMask.setVisible(false);

    text = new Text(txt);

    btn.setOnMouseEntered((MouseEvent me) -> {
      lightMask.setVisible(true);
    });
    btn.setOnMouseExited((MouseEvent me) -> {
      lightMask.setVisible(false);
    });
    btn.setOnMousePressed((MouseEvent me) -> {
      lightMask.setFill(Color.color(0.5, 0.5, 0.5, 0.2));
    });
    btn.setOnMouseReleased((MouseEvent me) -> {
      lightMask.setFill(Color.color(1, 1, 1, 0.2));
    });
    btn.getChildren().addAll(background, text, lightMask);

  }

  public StackPane getButton() {
    return this.btn;
  }
}
