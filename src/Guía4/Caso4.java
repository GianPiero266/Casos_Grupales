package Guía4;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer [] numero = new Integer[5];
		
		int num_par = 0, num_impar = 0;
		float sumatoria = 0, promedio = 0;
		
		System.out.println("Ingreso de números");
		System.out.println("==================");
		
		for (int x = 0; x < numero.length; x++) {
			System.out.print("Número " + (x + 1) + ": ");
			numero[x] = sc.nextInt();
		}
		
		for (int x = 0; x < numero.length; x++) {
			if (numero[x] % 2 == 0)
				num_par += 1;
			else
				num_impar += 1;
			
			sumatoria += numero[x];
		}
		
		promedio = sumatoria / 5;
		
		System.out.println("\n--- R E S U L T A D O S ---");
		System.out.println("Cantidad de números pares: " + num_par);
		System.out.println("Cantidad de números impares: " + num_impar);
		System.out.println("Promedio: " + promedio);
	}
}


