/**
 * Class singleton 
 * @author https://github.com/MatusMoura2
 */
package com.br.matusmoura.singleton.services;

import java.util.ArrayList;
import java.util.List;

import com.br.matusmoura.singleton.entities.NitendoGame;

public class NitendoGameRegistry {

	private static NitendoGameRegistry instance;

	private List<NitendoGame> games;

	private NitendoGameRegistry() {
		games = new ArrayList<>();
	}

	public static NitendoGameRegistry getInstance() {
		if (instance == null) {
			instance = new NitendoGameRegistry();
		}
		return instance;
	}
	
	public void addGame(NitendoGame game) {
		games.add(game);
	}
	
	public List<NitendoGame> getAllGames(){
		return games;
	}
}
