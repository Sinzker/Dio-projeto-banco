package code;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroConta;
		String nomeCliente, agencia;
		double saldo;
		
		System.out.println("Por favor entre com o Número da Conta: ");
		numeroConta = sc.nextInt();
		
		System.out.println("Por favor digite seu Nome: ");
		nomeCliente = sc.next();
		
		System.out.println("Por favor entre com o Número da Agência: ");
		agencia = sc.next();
		
		System.out.println("Digite o Saldo: ");
		saldo = sc.nextDouble();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
		
		
		
		
		
		
		sc.close();

	}

}
