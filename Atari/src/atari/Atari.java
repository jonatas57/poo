package atari;

import atari.games.Game;
import atari.games.tictactoe.TicTacToe;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Atari extends Application {

  private static Stage stage;
  private static Scene scene;

  @Override
  public void start(Stage stage) {
    Atari.stage = stage;
    StackPane root = new StackPane();
    scene = new Scene(root, 400, 400);
    
    Menu menu = new GameSelector(new TicTacToe());
    root.getChildren().addAll(menu);
    
    stage.setTitle("Atari");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

  public static Scene getScene() {
    return Atari.scene;
  }

  public static void setScene(Scene scene) {
    Atari.stage.setScene(scene);
  }

}
