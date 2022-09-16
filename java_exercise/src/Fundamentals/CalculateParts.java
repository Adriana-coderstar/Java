package Fundamentals;
import java.util.Locale;
import java.util.Scanner;

public class CalculateParts {
  public static void main(String[] arg) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int codeOne, quantPartsOne, codeTwo, quantPartsTwo;

    double princeOne, princeTwo, totalPrice;

    codeOne = sc.nextInt();
    quantPartsOne = sc.nextInt();
    princeOne = sc.nextDouble();
    
    codeTwo = sc.nextInt();
    quantPartsTwo = sc.nextInt();
    princeTwo = sc.nextDouble();

    totalPrice = princeOne * quantPartsOne + princeTwo * quantPartsTwo;

    System.out.printf("Valor a pagar: $ %.2f%n", totalPrice);

    sc.close();
  }
}
