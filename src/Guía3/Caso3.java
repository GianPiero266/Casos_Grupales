package Guía3;

import java.util.Scanner;

public class Caso3 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese número: ");
		int n = sc.nextInt();
		
		int i = 1, factorial=1;
		
		if (n>7) {
			System.out.println("El número superior es 7");
			}
		else {
		
		while (i<=n) {
			factorial*=i;
			i++;
		
			}
		System.out.println("El factorial de " + n + " es: " + factorial);
		}
	}

}