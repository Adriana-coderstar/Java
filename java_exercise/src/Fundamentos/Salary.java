package Fundamentos;
import java.util.Locale;
import java.util.Scanner;

public class Salary {
  public static void main(String[] arg) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int func, horasTrabalho;
    double valorHora, sal;

    func = sc.nextInt();

    horasTrabalho = sc.nextInt();
    valorHora = sc.nextDouble();

    sal = valorHora * horasTrabalho;

    System.out.println("Número do funcionário: " + func);
    System.out.printf("Salário recebido: U$ %.2f%n", sal);

    sc.close();
  }
}
