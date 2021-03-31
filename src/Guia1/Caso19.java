package Guia1;

import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		float perimetro = 0;
		
		System.out.println("Programa para calcular el perímetro de un triángulo");
		System.out.println("===================================================");
		System.out.print("\nIngrese la medida del lado 1: ");
		float l1 = a.nextFloat(); 
		System.out.print("Ingrese la medida del lado 2: ");
		float l2 = a.nextFloat();
		System.out.print("Ingrese la medida del lado 3: ");
		float l3 = a.nextFloat();
		
		perimetro = l1 + l2 + l3;
		
		System.out.println("\nEl perímetro del triángulo es  " + perimetro);

	}

}


