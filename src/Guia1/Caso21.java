package Guia1;

import java.util.Scanner;

public class Caso21 {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingrese el gasto: ");
	int g = sc.nextInt();
	
	double vd = g * 0.12;
	
	double td = g - vd ;
	
	System.out.println("\n --------------------");
	System.out.println("\n Resultados ");
	System.out.println("\n --------------------");
	System.out.println("El valor disminuido es: " + td);
	
	
	
	}

}