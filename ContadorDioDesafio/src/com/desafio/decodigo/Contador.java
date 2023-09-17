package com.desafio.decodigo;

import java.util.Scanner;

import com.desafio.decodigo.execption.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;

		System.out.print("Digite um numero: ");
		num1 = sc.nextInt();
		System.out.print("Digite outro numero: ");
		num2 = sc.nextInt();

		try {
			contar(num1, num2);

		} catch (ParametrosInvalidosException exc) {
			System.out.println(exc.getMenssagemDeErro());

		}
	}

	static void contar(int num1, int num2) throws ParametrosInvalidosException {
	    if (num1 >= num2) {
	        throw new ParametrosInvalidosException(num1, num2);
	    }

	    for (int i = num1; i <= num2; i++) {
	        System.out.print(i + ", ");
	    }
	}
	}

