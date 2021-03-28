package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso23 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("#.00");
	     
	     System.out.print("Ingresar nombre del producto: ");
		 String producto = sc.nextLine();
		 
		 System.out.print("Precio: ");
		 float precio = sc.nextFloat();
		 
		 System.out.print("Cantidad: ");
		 float cantidad = sc.nextFloat();
		 float importe = cantidad * precio; 
		 float IGV = importe * (float) (0.18);
		 float descuento = importe *(float) (0.03);
		 float total = importe - descuento + IGV;
		 
		
		 System.out.println("---RESULTADOS---");
		 System.out.println("Producto.....: " + producto);
		 System.out.println("Precio.......: " + precio);
		 System.out.println("Cantidad.....: " + cantidad);
		 System.out.println("Importe......: " + importe);
		 System.out.println("IGV..........: " + IGV);
		 System.out.println("Descuento....: " + descuento);
		 System.out.println("Total a pagar: " + total );

	}

}