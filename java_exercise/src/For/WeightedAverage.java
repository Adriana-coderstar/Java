package For;

import java.util.Locale;
import java.util.Scanner;

public class WeightedAverage {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
        
    double n = sc.nextDouble();
    
    for(int i = 0; i < n; i ++) {
      
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double c = sc.nextDouble();

      double m = (a * 2+ b * 3+ c * 5) / (2 +3 +5);
      System.out.printf("%.1f%n", m);
    }
    sc.close();
  }
}

// calculo Média Ponderada = (a * 2) + (b * 3) + (c * 5) / 2 + 3 + 5