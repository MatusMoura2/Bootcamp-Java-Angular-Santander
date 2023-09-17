package com.desafio.decodigo.execption;

public class ParametrosInvalidosException extends Exception{
	
	private int num1;
	private int num2;
	
	public ParametrosInvalidosException(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public String getMenssagemDeErro() {
		return "Parâmetros inválidos: " + num1 + " (o primeiro numero) deve ser menor que " + num2+" (o segundo numero).";
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

}
