package com.senati.eti;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Caso22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingresar nombre del alumno:");
		String nombre = sc.nextLine();
		
		System.out.print("Ingresar nota 1: ");
		float nota1 = sc.nextFloat();
		
		System.out.print("Ingresar nota 2: ");
		float nota2 = sc.nextFloat();
		
		System.out.print("Ingresar nota 3: ");
		float nota3 = sc.nextFloat();
		
		float not1 = nota1 * 0.2f;
		float not2 = nota2 * 0.3f;
		float not3 = nota3 * 0.5f;
		float promedio = (not1+not2+not3);
		
		System.out.println("---Resultados---");
		System.out.println("Nombre : " +nombre.toUpperCase());
		System.out.println("El 20% de la nota1 es: "+ df.format(not1));
		System.out.println("El 30% de la nota2 es: "+ df.format(not2));
		System.out.println("El 50% de la nota3 es: "+ df.format(not3));
		System.out.println("El promedio total es "+ df.format(promedio));
						
	}

}