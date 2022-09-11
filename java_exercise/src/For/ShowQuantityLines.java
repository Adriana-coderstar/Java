package For;

import java.util.Scanner;

public class ShowQuantityLines {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 1; i <= n; i ++) {

      int a = i;

      int x = i * i;

      int y = i * i * i;
      
      System.out.printf("%d %d %d%n", a, x, y);
    }
    
    sc.close();
  }
}


