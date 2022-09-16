package Functions;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 3 numbers: ");

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int higher = max(a, b, c);

    showResult(higher);

    sc.close();
  }

  public static int max(int x, int y, int z) {
    int higherNumber;

    if ( x > y && x > z) {
      higherNumber = x;
    } else if (y > z) {
      higherNumber = y;
    } else {
      higherNumber = z;
    }

    return higherNumber;
  }

  public static void showResult(int value) {
    System.out.println("Higher: " + value);
  }
}
