package com.senati.eti;

import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresar lado del tri�ngulo: ");
		int l = sc.nextInt();
		
		int perimetro = 3*l ;
		
		System.out.println("---Resultado---");
		System.out.println("El per�metro del tri�ngulo es: "+perimetro);
			
	}

}