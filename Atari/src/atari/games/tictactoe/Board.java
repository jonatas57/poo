package atari.games.tictactoe;

import atari.games.tictactoe.players.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class Board extends GridPane {
  
  private Cell[][] cells;
  private int[] checkLine, checkColumn;
  private int checkDiagonal1, checkDiagonal2;
  private Player[] players = new Player[2];
  private static int[] lastPlay = new int[2];

  public Board() {
    int size = Config.getBoardSize();
    cells = new Cell[size][size];
    checkLine = new int[size];
    checkColumn = new int[size];
    
    for (int i = 0;i < 2;i++) {
      players[i] = (Config.isHuman(i) ? new Human() : new IA());
    }
    
    super.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
    super.setHgap(5);
    super.setVgap(5);
    super.setMaxSize(55 * size - 5, 55 * size - 5);

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        cells[i][j] = new Cell(j, i);
        super.add(cells[i][j], j, i);
      }
    }
  }
  public static void setLastPlay(int x, int y) {
    lastPlay = new int[] {x, y};
  }
}
