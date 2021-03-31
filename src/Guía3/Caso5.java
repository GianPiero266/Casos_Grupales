package Guía3;

import java.util.Scanner;

public class Caso5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i =1, contador=0, nm=999999999;
		
		while (i<=5) {
            System.out.println("Ingrese número " + i + ":");
            contador=sc.nextInt();
			
            if (contador<nm) nm=contador;
            
            i++;	
		}
	    System.out.println("El numero menor es: " + nm);
	}
}