package While;

import java.util.Scanner;

public class TypeFuel {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int type = sc.nextInt();
		
		while (type != 4) {
			if (type == 1) {
				alcool = alcool + 1;
			}
			else if (type == 2) {
				gasolina = gasolina + 1;
			}
			else if (type == 3) {
				diesel = diesel + 1;
			} 
      else if (type > 4) {
        System.out.println("Valor invalido");
      }
			type = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
  }
}
