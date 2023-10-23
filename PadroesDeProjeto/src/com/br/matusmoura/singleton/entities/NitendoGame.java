package com.br.matusmoura.singleton.entities;

public class NitendoGame {
	
	private String title;
	private int releaseYear;
	
	public NitendoGame(String title, int releaseYear) {
		this.title = title;
		this.releaseYear = releaseYear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Override
	public String toString() {
		return "O game " + title + ", foi lançado no ano de " + releaseYear + ".";
	}
	
	

	
}
