package Guia1;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		
		float n1 = 0, n2 = 0, promedio = 0, aumento = 0, disminucion = 0;

		System.out.print("Ingrese el primer número: ");
		n1 = a.nextFloat();
		
		System.out.print("Ingrese el segundo número: ");
		n2 = a.nextFloat();
		
		promedio = (n1 + n2) / 2;
		aumento = (n1 * 120) / 100;
		disminucion = (n2 * 70) / 100;
		
		System.out.println("\nEl promedio de los números es: " + promedio);
		System.out.println("El primer número aumentado en 20% es: " + aumento);
		System.out.println("El segundo número disminuido en 30% es: " + disminucion);
	}

}

