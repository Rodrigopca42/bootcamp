package aplicacao;

import java.util.Scanner;
import entities.Hospedes;


public class Programa {

	public static void main(String[] args) {
		
		
		Scanner tec = new Scanner(System.in);
		
		Hospedes[] hosp = new Hospedes[10];
		
		System.out.print("Quantos quartos serão reservados? ");
		int n = tec.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Quarto: #" + i + ":");
			
			System.out.print("Nome: ");
			tec.nextLine();
			String nome = tec.nextLine();
			
			System.out.print("Email: ");
			String email = tec.next();
			
			System.out.print("Numero do Quarto? ");
			int quarto = tec.nextInt();
			hosp[quarto] = new Hospedes(nome, email);	
		}
		
		System.out.println();
		System.out.println("Quartos Alugados: ");
		
		for(int i = 0; i < 10; i++) {
			if(hosp[i] != null) {
			System.out.println(i+": "+ hosp[i]);
			}
		}
		
		tec.close();

	}

}
