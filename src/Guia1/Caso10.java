package Guia1;

import java.util.Scanner;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		float area = 0, perimetro = 0;
		double pi = 3.1416;
		
		System.out.print("Radio: ");
		int radio = a.nextInt();
		
		area = (float)(pi * Math.pow(radio, 2));
		perimetro = (float)((2 * pi) * radio);
		
		System.out.println("\nResultados");
		System.out.println("�rea del c�rculo: " + area);
		System.out.println("Per�metro del c�rculo: " + perimetro);

	}

}
