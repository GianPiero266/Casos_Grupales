package Guia2;

import java.util.Scanner;

public class Caso6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese sueldo: ");
		float s = sc.nextFloat();
		
		
		if (s>2800) {
			
			double i = (float) s*0.05;
			System.out.println("Impuesto Calculado es: " + i);
		}
			
		
		if (s<=2800) {
			
			double i = (float) s*0.02;
			System.out.println("Impuesto Calculado es: " + i);
		}
		
		
		
		
		
		 
		
		
	
	}
	

}