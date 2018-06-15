import java.util.Scanner;

public class Consoantes {
  public static void main(String[] args) {
    int cons = 0;
    char s = 'a';
    Scanner cin = new Scanner(System.in);
    do {
      if (s != 'a' && s != 'e' && s != 'i' && s != 'o' && s != 'u' && s != 'A' && s != 'E' && s != 'I' && s != 'O' && s != 'U') cons++;
      s = cin.next().charAt(0);
    } while (s != '*');
    System.out.println(cons);
  }
}
