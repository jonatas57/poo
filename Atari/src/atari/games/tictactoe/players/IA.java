package atari.games.tictactoe.players;

import java.util.Random;

public class IA extends Player {
  private Random random;
  
  public IA() {
    random = new Random();
  }
  
  public double pickDouble() {
    double a = random.nextDouble();
    random.setSeed(System.currentTimeMillis());
    return a;
  }
}
