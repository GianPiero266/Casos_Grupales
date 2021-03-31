package Guia1;

import java.util.Scanner;

public class Caso20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor de la venta");
		int v = sc.nextInt();
		
		double va = v*0.42;
		
		double t = v+va;
		
		System.out.println("\n --------------------");
		System.out.println("\n Resultados ");
		System.out.println("\n --------------------");
		System.out.println("Valor Aumentado en 42%: " + t);
		
				
	}

}