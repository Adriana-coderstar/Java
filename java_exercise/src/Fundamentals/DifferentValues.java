package Fundamentals;
import java.util.Scanner;

public class DifferentValues {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a, b, c, d, dif;

    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();

    dif = a * b - c * d;

    System.out.println("A diferença é =" + dif);

    sc.close();
  }
}
