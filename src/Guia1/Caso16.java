package Guia1;

import java.util.Scanner;

public class Caso16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese las horas trabajadas: ");
		int ht = sc.nextInt();
		 
		System.out.println("Ingrese tarifa por hora: ");
		float th = sc.nextFloat();
		
		float s = (float) ht*th;
		
		float b = (float) 0.05*(ht*th);
		
		float t = (float) s+b;
		
		double d = t*3.24;
		
		System.out.println("\n--------------------");
		System.out.println("\nResultados ");
		System.out.println("\n--------------------");
		System.out.println("Sueldo: " + s);
		System.out.println("Bono: " + b);
		System.out.println("Total: " + t);
		System.out.println("Total en dólares: " + d);
		
		
		
	}

}
