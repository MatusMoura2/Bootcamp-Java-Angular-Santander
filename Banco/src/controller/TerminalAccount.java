package controller;

import java.util.ArrayList;
import java.util.List;

import entity.User;

public class TerminalAccount {

	private List <User> clients;
	
	public TerminalAccount() {
		this.clients = new ArrayList<>();
	}
	
	public void createAccount(User client, double initialValue) {
		if (validCpf(client.getCpf()) && initialValue >= 300) {
			clients.add(client);
			System.out.println("Parabéns"+ client.getName()+" sua conta foi criada com sucesso!");
		}
	}
	
	private boolean validCpf(String cpf) {
		return cpf.length()==11;
	}
}
