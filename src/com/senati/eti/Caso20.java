package com.senati.eti;

import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresar el valor de venta: ");
		float vn = sc.nextFloat();
		
		float aumentado = vn * 1.42f;
		
		System.out.println("---RESULTADOS---");
		System.out.println("El valor de venta incrementado en 42 % es " + aumentado);
				
	}

}