package Guia2;

import java.util.Scanner;

public class Caso4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese n�mero 1: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese n�mero 2: ");
		int n2 = sc.nextInt();
		
		System.out.print("Ingrese n�mero 3: ");
		int n3 = sc.nextInt();
		
		String mensaje = "";
		
		if (n1 == n2 && n1 == n3 && n2 == n3)
			mensaje = "Los tres n�meros son iguales";
		else if (n1 < n2 && n1 < n3)
			mensaje = "El primer n�mero " + n1 + " es menor";
		else if (n2 < n1 && n2 < n3)
			mensaje = "El segundo n�mero " + n2 + " es menor";
		else
			mensaje = "El tercer n�mero " + n3 + " es menor";
		
		System.out.println("\n--- R E S U L T A D O ---");
		System.out.println(mensaje);
	}
}



