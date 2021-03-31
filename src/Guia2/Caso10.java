package Guia2;

import java.util.Scanner;

public class Caso10 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese nombre: ");
		String n = sc.nextLine();
		
		System.out.println("Ingrese horas trabajadas: ");
		float ht = sc.nextFloat();
		
		System.out.println("Tarifa por hora: ");
		float th = sc.nextFloat();
		
		System.out.println("Minutos de tardanza: ");
		float mt = sc.nextFloat();
		
		float importe = (float) ht*th;
		
		System.out.println("-----------------");
		System.out.println("R E S U L T A D O S");
		System.out.println("-----------------");
		System.out.println("Importe: " + importe);
		
		if (ht>60) {
			double bono = (float) importe * 0.13;
			System.out.println("Bono: " + bono);
		}	
		
		else {
			double bono = importe * 0.04;
		    System.out.println("Bono: " + bono);
		}
		
		
		
		if (mt>15) {
			double des = importe * 0.03;
			System.out.println("Descuento: " + des);
		}
		
		else {
			double des = 0;
			System.out.println("Descuento: " + des);
		}
		
		double meta_final = (ht/70) * 100;
		System.out.println("Meta alcanzada: " + meta_final + "%");
		
		
		
		
	}

}
