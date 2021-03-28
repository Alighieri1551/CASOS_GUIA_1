package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingresar primer monto: ");
		float pm =sc.nextFloat();
		
		System.out.print("Ingresar segundo monto: ");
		float sm =sc.nextFloat();
		
		System.out.print("Ingresar tercer monto: ");
		float tm =sc.nextFloat();
		
		float r1 = pm/5 + sm*0.2f;
		float r2 = (tm*1.6f)/2;
		float r3 = (pm+sm+tm)*0.92f;
		
		System.out.println("---RESULTADOS---");
		System.out.println("La quinta parte del primer monto mas el 20 % del segundo monto: "+df.format(r1));
		System.out.println("La mitad del aumento en 60 % del tercer monto.................: "+df.format(r2));
		System.out.println("Disminuya en 8 % la suma de los tres montos...................: "+df.format(r3));
		
	}

}