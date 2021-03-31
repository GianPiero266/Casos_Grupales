package Guia1;

import java.util.Scanner;

public class Caso23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese nombre de producto: ");
		String p = sc.next();
		
		System.out.println("Ingrese precio: ");
		float precio = sc.nextFloat();
		
		System.out.println("Cantidad: ");
		int cantidad = sc.nextInt();
		
		float importe = (float) precio * cantidad;
		
		double igv = (float) importe * 0.18;
		
		double descuento = (float) importe * 0.03;
		
		double total = (float) importe + igv - descuento;
		
		System.out.println("Resultados ");
		System.out.println("-----------");
		System.out.println("Importe: " + importe);
		System.out.println("IGV: " + igv );
		System.out.println("Descuento: " + descuento);
		System.out.println("Total: " + total);
		
		
	}
	
	

}
