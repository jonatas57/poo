import java.util.Scanner;

public class Chocolates {
  public static void main(String[] args) {
    int n, m;
    Scanner cin = new Scanner(System.in);
    n = cin.nextInt();
    m = cin.nextInt();
    int[][] c = new int[n][m];
    for (int i = 0;i < n;i++) {
      for (int j = 0;j < n;j++) {
        c[i][j] = cin.nextInt();
      }
    }
    int dia, mes, t = 0;
    dia = cin.nextInt();
    mes = cin.nextInt();
    if (mes < n) {
      for (int i = 0;i < n;i++) {
        int s = 0;
        for (int j = 0, k = 0;k < n;) {
          if (k - j + 1 < mes) s += c[i][k++];
          else {
            if (s == dia) t++;
            s += c[i][k++];
            s -= c[i][j++];
          }
        }
      }
    }
    if (mes < m) {
      for (int i = 0;i < m;i++) {
        int s = 0;
        for (int j = 0, k = 0;k < m;) {
          if (k - j + 1 < mes) s += c[k++][i];
          else {
            if (s == dia) t++;
            s += c[k++][i];
            s -= c[j++][i];
          }
        }
      }
    }
    System.out.println(t);
  }
}
