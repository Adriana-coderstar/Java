package For;

import java.util.Locale;
import java.util.Scanner;

public class DivisionDenominator {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double n = sc.nextDouble();

    for ( int i = 0; i < n; i++) {
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      
      if (b == 0) {
        System.out.println("Divisao impossivel");
      } else {
        double div = (double) a/b;
        System.out.printf("%.2f%n", div);
      }
    }
    sc.close();
  }
}
