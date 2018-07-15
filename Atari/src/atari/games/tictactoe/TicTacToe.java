package atari.games.tictactoe;

import atari.Atari;
import atari.Button;
import atari.Menu;
import atari.games.Game;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class TicTacToe implements Game {
  private StackPane root;
  private Scene menuScene;
  private Scene playScene;
  private Menu menu;
  
  private Board board;
  
  public TicTacToe() {
    root = new StackPane();
    
    menuScene = new Scene(root, 400, 400);
    
    Button play = new Button(Color.GREEN, "PLAY");
    play.setOnMouseClicked((event) -> {
      this.play();
    });
    Button setup = new Button(Color.GREEN, "SETUP");
    setup.setOnMouseClicked((event) -> {
      System.out.println("setup");
    });
    Button exit = new Button(Color.RED, "EXIT");
    exit.setOnMouseClicked((event) -> {
      Atari.setScene(Atari.getScene());
    });
    
    menu = new Menu(play, setup, exit);
    
    root.getChildren().add(menu);
  }
  
  @Override
  public void startGame() {
    Atari.setScene(this.menuScene);
  }
  
  @Override
  public void play() {
    StackPane game = new StackPane();
    playScene = new Scene(game, 400, 400);
    board = new Board();
    game.getChildren().add(board);
    Atari.setScene(this.playScene);
  }
  
}
