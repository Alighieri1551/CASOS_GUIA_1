package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingresar las horas trabajadas: ");
		float h = sc.nextFloat();
		
		System.out.print("Ingresar la tarifa por hora: ");
		float t = sc.nextFloat();
		
		float sueldo = t * h;
		float total = sueldo * 1.05f;
		float bono = total - sueldo;
		float dolares = total/3.24f;
		
		System.out.println("---Resultados---");
		System.out.println("El sueldo es de..........: "+ df.format(sueldo));
		System.out.println("El bono es...............: "+ df.format(bono));
		System.out.println("El total es..............: "+ df.format(total));
		System.out.println("El total en dólares es de: "+df.format(dolares));
					
	}

}