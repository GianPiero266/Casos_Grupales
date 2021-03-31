package Guia1;

import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		float area = 0;
		
		System.out.println("Programa para calcular el área de un triángulo");
		System.out.println("===========================================");
		System.out.print("\nIngrese la base: ");
		float base = a.nextInt();
		System.out.print("Ingrese la altura: ");
		float altura = a.nextInt();
		
		area = (base * altura) / 2;
		
		System.out.println("\nEl área del triángulo es " + area);
	}

}

