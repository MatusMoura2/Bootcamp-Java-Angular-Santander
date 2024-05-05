package main;

import java.util.Scanner;

import controller.TerminalAccount;
import entity.User;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TerminalAccount account = new TerminalAccount();
		
		String name;
		String cpf;
		double initialValue;
		
		System.out.println("Bem vindo(a) conta do banco Moura Forte");
		
		System.out.print("Digite o seu cpf: ");
		cpf = sc.nextLine();
		
		System.out.print("Digite o seu nome: ");
		name = sc.nextLine();
		
		System.out.print("Digite o valor que deseja depositar para abrir a sua conta, não é valido valor menor que 300,00R$");
		initialValue = sc.nextDouble();
		
		User client = new User(cpf,name);
		
		account.createAccount(client, initialValue);
	}

}
