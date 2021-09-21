package if_else;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int ano;
		
		System.out.println("Digite um ano para saber se é bissexto ou não:");
		ano = s.nextInt();
		
		if(ano % 400 == 0) {
			System.out.println(ano + "\né bissexto!.");
			
		}else if((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println(ano + "\né bissexto!." );
		} else {
			System.out.println(ano +"\nnão é bissexto!" );
		}

	}

}