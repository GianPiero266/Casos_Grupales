package Guia2;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nota: ");
		int nota = sc.nextInt();
		
		String mensaje = "Sin palabras";
		
		if (nota >= 8 && nota <= 10)
			mensaje = "Malo";
		else if (nota >= 11 && nota <= 14)
			mensaje = "Regular";
		else if (nota >= 15 && nota <= 17)
			mensaje = "Notable";
		else if (nota >= 18 && nota <= 20)
			mensaje = "Excelente";
		else if (nota > 20)
			mensaje = "La nota maxima es 20";
		
		System.out.println("--- R E S U L T A D O ---");
		System.out.println("Estado obtenido: " + mensaje);
	}
}


