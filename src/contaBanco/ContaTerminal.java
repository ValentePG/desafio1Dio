package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da conta!");
		int numeroDaConta = scanner.nextInt();
		
		System.out.println("Por favor, digite a Agência:");
		String agencia = scanner.next();
		
		System.out.println("Por favor, digite o seu primeiro nome:");
		String nomeCliente = scanner.next();
		
		System.out.println("Por favor, digite o seu segundo nome:");
		String sobrenomeCliente = scanner.next();
		
		System.out.println("Por favor, digite seu saldo:");
		float saldo = scanner.nextFloat();
		
		System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente 
				+ ",obrigado por criar uma conta em nosso banco,"
				+ "\nsua agência é " + agencia
				+ "\nconta " + numeroDaConta
				+ "\ne seu saldo " + saldo 
				+ " já está disponível para saque.");
	}

}
