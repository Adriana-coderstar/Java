package Fundamentos;
import java.util.Scanner;

public class ExerciseSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a, b, sum;

    a = sc.nextInt();
    b = sc.nextInt();

    sum = a + b;

    System.out.println("Soma = " + sum);

    sc.close();
  }
}