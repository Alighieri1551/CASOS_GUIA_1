package com.senati.eti;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("radio:");
		float radio = sc.nextInt();


		float rc = (int) Math.pow(radio,2);
		float area = 3.1416f * rc;
		float perimetro= 2*3.1416f*radio;


		System.out.println("---RESULTADOS---");
		System.out.println("El área del círculo es.....: " + area);
		System.out.println("El perímetro del círculo es: " + perimetro);
	     		
	}

}