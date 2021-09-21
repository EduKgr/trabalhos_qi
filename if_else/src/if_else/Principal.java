package if_else;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int lado1, lado2, lado3;
		int opcao = 1;
		
		while(opcao == 1) {
			Scanner s = new Scanner(System.in);
			
			System.out.println("Entre com o lado 1:");
			lado1 = s.nextInt();
			System.out.println("--------------------------------------");
			
			System.out.println("Entre com o lado 2:");
			lado2 = s.nextInt();
			System.out.println("--------------------------------------");
			
			System.out.println("Entre com o lado 3:");
			lado3 = s.nextInt();
			System.out.println("--------------------------------------");
			
			if((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
				if (lado1 == lado2 && lado1 == lado3) {
					System.out.println("Triângulo Equilatero");
				} else if((lado1 == lado2) || (lado1 ==lado3)) {
					System.out.println("Triângulo Isosceles");
				} else
					System.out.println("Triângulo Escaleno");
			} else {
				System.out.println("Não é um triângulo!");
			}
			System.out.println("z-z-z-z-z-z-z-z-z-z-z-z-z-z-z-z-z-");
			System.out.println("Deseja continuar? 1 = sim, 2 = não");
			opcao = s.nextInt();
			System.out.println("z-z-z-z-z-z-z-z-z--z-z-z-z-z-z-z-z-");
		}
		System.out.println("Aaaiii que burrroo!");
	}	
}