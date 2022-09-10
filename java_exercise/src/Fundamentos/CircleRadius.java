package Fundamentos;
import java.util.Locale;
import java.util.Scanner;

public class CircleRadius {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double r , a , pi = 3.14159;

    r = sc.nextDouble();

    a = pi * r * r;

    System.out.printf("a = %.4f%n", a);

    sc.close();
  }
}
