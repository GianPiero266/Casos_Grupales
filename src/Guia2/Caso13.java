package Guia2;

import java.util.Scanner;

public class Caso13 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Numero 1: ");
		float n1 = sc.nextFloat();
		
		System.out.println("Numero 2: ");
		float n2 = sc.nextFloat();
		
		System.out.println("Ingrese operación [1-6] : ");
		float op = sc.nextFloat();
		
		System.out.println("----------------");
		System.out.println("---RESULTADOS---");
		System.out.println("----------------");
		System.out.println("Número 1: " + n1);
		System.out.println("Número 2: " + n2);
		
		if (op==1) {
		   System.out.println("Operación: Suma");
		   System.out.println("Resultado: " + (n1 + n2));
		}  
		  
		if (op==2) {
		   System.out.println("Operación: Resta");
		   System.out.println("Resultados: " + (n1-n2));
		}
		
		if (op==3) {
		   System.out.println("Operación: Producto");
		   System.out.println("Resultados: " + (n1*n2));
		}
		
		if (op==4 && n2!=0) {
		   System.out.println("Operación: División");
		   System.out.println("Resultados: " + (n1/n2));
		   
		}
		
		if (op==4 && n2==0) {
			System.out.println("No es posible dividir entre 0");
			System.out.println("Resultados: Error");
		}
		
		if (op==5 && n2!=0) {
			System.out.println("Operación: Resto");
			System.out.println("Resultados: " + n1 % n2);
		}
		
		if (op==5 && n2==0) {
			System.out.println("Operación: No es posible hallar el resto");
			System.out.println("Resultados: 0");
		}
		
		if (op==6) {
			System.out.println("Operación: Promedio");
			System.out.println("Resultados: " + ((n1+n2)/2));
		}
		
		else {
			System.out.println("ERROR: solo ingrese números del [1-6]");
		}
		
	}

}
