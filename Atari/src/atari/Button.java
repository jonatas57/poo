package atari;

import atari.games.Game;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Button extends StackPane {

  private Rectangle body, lightMask;
  private Text text;

  public Button() {
    super();

    this.body = new Rectangle(100, 30);
    this.body.setArcHeight(30);
    this.body.setArcWidth(30);
    this.body.setFill(Color.BLUE);

    this.lightMask = new Rectangle(100, 30, Color.color(1, 1, 1, 0.2));
    this.lightMask.setArcHeight(30);
    this.lightMask.setArcWidth(30);
    this.lightMask.setVisible(false);
    this.body.setOnMouseEntered((MouseEvent me) -> {
      this.lightMask.setVisible(true);
    });
    this.lightMask.setOnMouseExited((MouseEvent me) -> {
      this.lightMask.setVisible(false);
    });
    this.lightMask.setOnMousePressed((MouseEvent me) -> {
      this.lightMask.setFill(Color.color(0, 0, 0, 0.2));
    });
    this.lightMask.setOnMouseReleased((MouseEvent me) -> {
      this.lightMask.setFill(Color.color(1, 1, 1, 0.2));
    });

    this.text = new Text("Button");

    super.getChildren().addAll(this.body, this.text, this.lightMask);
  }

  public Button(Object... args) {
    this();
    this.setProprieties(args);
  }

  private void setProprieties(Object... args) {
    for (Object obj : args) {
      if (obj instanceof String) {
        this.text.setText((String) obj);
      }
      else if (obj instanceof Paint) {
        this.body.setFill((Paint) obj);
      }
      else if (obj instanceof Game) {
        this.setOnMouseClicked((MouseEvent me) -> {
          this.text.setText(((Game) obj).getClass().getSimpleName());
          ((Game) obj).startGame();
        });
      }
    }
  }

//  public Button(Game game) {
//    this();
//    this.setText(game.getClass().getName());
//    this.setOnMouseClicked((MouseEvent me) -> {
//      game.startGame();
//    });
//  }
  private void setText(String text) {
    this.text = new Text(text);
  }
}
