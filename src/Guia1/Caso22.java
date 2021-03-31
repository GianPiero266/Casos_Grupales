package Guia1;

import java.util.Scanner;

public class Caso22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nombre: ");
		String n = sc.next();
		
		System.out.println("Nota 1 : ");
		float nota1 = sc.nextFloat();
		
		System.out.println("Nota 2 : ");
		float nota2 = sc.nextFloat();
		
		System.out.println("Nota 3 : ");
		float nota3 = sc.nextFloat();
		
		float promedio = (float) (nota1*0.2 + nota2*0.3 + nota3*0.5);
		
		System.out.println("RESULTADOS: ");
		System.out.println("Promedio: " + promedio );
		
		
		
		
		
		
		
		
		
	}
	
	

}
