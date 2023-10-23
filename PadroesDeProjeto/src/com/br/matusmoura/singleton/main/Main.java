package com.br.matusmoura.singleton.main;

import java.util.List;
import java.util.Scanner;

import com.br.matusmoura.singleton.entities.NitendoGame;
import com.br.matusmoura.singleton.services.NitendoGameRegistry;

public class Main {

	public static void main(String[] args) {
		
		NitendoGameRegistry registry = NitendoGameRegistry.getInstance();
		
		Scanner sc = new Scanner(System.in);
		
		String title;
		String response;
		int releaseYear;
		
		boolean newRegistry = true;
		
		while(newRegistry) {
			
			System.out.print("Titulo do jogo: ");
			title = sc.nextLine();
			
			System.out.print("Ano de lançamento: ");
			releaseYear = sc.nextInt();
			sc.nextLine();
			
			NitendoGame game = new NitendoGame(title, releaseYear);
			
			registry.addGame(game);
			
			System.out.print("Deseja adicionar outro game? (S p/sim, n p/não: ");
			response = sc.nextLine().trim().toUpperCase();
			
			if(!response.equals("S")) {
				newRegistry = false;
			}
		}
		System.out.println("\nGames registrados:");
		List<NitendoGame>games = registry.getAllGames();
		for(NitendoGame game : games) {
			System.out.println(game);
		}

	}

}
