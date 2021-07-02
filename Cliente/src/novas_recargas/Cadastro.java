package novas_recargas;

import java.util.Locale;
import java.util.Scanner;
import recargas.Registro;

public class Cadastro {

	public static void main(String[] args) {
	
		// muda codigo 
		
		Locale.setDefault(Locale.US); 
		Scanner dt = new Scanner(System.in);
		Registro cont;
	
		System.out.print("Entre com seu nome: ");
		String nome = dt.nextLine();
		
		System.out.print("Entre com seu CPF: ");
		Double cpf = dt.nextDouble();
		
		System.out.print("Entre com seu Número: ");
		Double numero = dt.nextDouble();
		
		System.out.println("Tem recarga inicial (s/n) ");
		char recarga =  dt.next().charAt(0);
		
		if(recarga == 's') {
			System.out.print("Recarga  inicial : ");
			double nova = dt.nextDouble();
			cont = new Registro(nova, nome, cpf, numero );
			
		}
		else {
		cont = new Registro(nome, recarga, recarga, recarga);
		}
			
		
		System.out.println();
		System.out.println("Recargas feitas: ");
		System.out.println(cont);
		
		
		
		
		System.out.println();
		System.out.print("Faça mais uma recarga:  ");
		double deposito = dt.nextDouble();
		cont.deposito(deposito);
		System.out.println("Valor atualizado da recarga:");
		System.out.println(cont);
		
//		System.out.println(); 
//		System.out.print("Valor de saque");
//		double saque = dt.nextDouble();
//		cont.saque(saque);
//		System.out.println("Valor atualizado da conta");
//		System.out.println(cont);
		
		
		
		dt.close();
			
		}

	}


