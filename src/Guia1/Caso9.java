package Guia1;

import java.util.Scanner;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("Ingrese lado 1: ");
		int lado1 = a.nextInt();
		
		System.out.print("Ingrese lado 2: ");
		int lado2 = a.nextInt();
		
		int area = lado1 * lado2;
		int perimetro = lado1 * 2 + lado2 * 2;
		
		System.out.println("\nResultados");
		System.out.println("Área del rectángulo: " + area);
		System.out.println("Perímetro: " + perimetro);
	}

}

