package com.senati.eti;

import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresar base del triángulo..: ");
		float base = sc.nextFloat();
		
		System.out.print("Ingresar altura del triángulo: ");
		float altura = sc.nextFloat();
		
		float area = (base * altura)/2 ;
		
		
		System.out.println("---Resultado---");
		System.out.println("El área del triángulo es: " + area);
			
	}

}