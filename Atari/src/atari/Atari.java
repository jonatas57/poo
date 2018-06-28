package atari;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Atari extends Application {

  @Override
  public void start(Stage stage) throws Exception {
    GridPane root = new GridPane();
    
    Scene scene = new Scene(root, 500, 500);
    
    Menu menu = new Menu(new Button(), new Button());
    
    root.getChildren().add(menu.getMenu());
    stage.setTitle("Atari");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

}
