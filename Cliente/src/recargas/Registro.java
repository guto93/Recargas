package recargas;

public class Registro {
	
		private String nome;
		private double cpf;
		private double saldo;
		private double numero;
	
		

		//USANDO SOBRECARGA ADICIONADO APENAS UMA VARIAVEL A MAIS 
		
		public Registro(String nome, double cpf, double saldo, double numero) {
			this.nome = nome;
			this.cpf = cpf;
			this.saldo = saldo;
			this.numero = numero;
		}

//		public String getNome() { 
//			return nome;
//		}
//		
		public Registro (double nova,String nome, double cpf, double numero ) {
			this.numero = numero;
			this.nome = nome;
			this.cpf = cpf;
			deposito(nova);
			
		}

//		public void setNome(String nome) {
//			this.nome = nome;
//		}
		
		public double getSaldo() {
			return saldo;
		}
		
		public void deposito (double deposit) {
			saldo += deposit;  // saldo 
		}
		

		
		public String toString () {
			return "Cliente: "
					+ nome 
					+" , CPF:"
				    +  String.format("%.0f", cpf)	
				    + " Numero:"
				    + String.format("%.0f", numero)	
				    +" , Saldo: $ "
				    + String.format("%.2f", saldo);
				
		}
	}


