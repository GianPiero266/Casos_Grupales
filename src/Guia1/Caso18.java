package Guia1;

import java.util.Scanner;

public class Caso18 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Ingrese la base del triangulo: ");
	int b = sc.nextInt();
	
	System.out.println("Ingrese la altura del triangulo: ");
	int h = sc.nextInt();
	
	int área = (int) (b*h/2);
	
	System.out.println("\n--------------------");
	System.out.println("\nResultados ");
	System.out.println("\n--------------------");
	System.out.println("El área es: " + área);
    
	}
		
	

}
