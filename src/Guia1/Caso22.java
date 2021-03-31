package Guia1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese nombre: ");
		String alumno = sc.nextLine();
		
		System.out.print("Nota 1: ");
		float nota1 = sc.nextFloat();
		
		System.out.print("Nota 2: ");
		float nota2 = sc.nextFloat();
		
		System.out.print("Nota 3: ");
		float nota3 = sc.nextFloat();
		
		float promedio = (nota1 * 0.2f) + (nota2 * 0.3f) + (nota3 * 0.5f);
		
		System.out.println("---------------------------");
		System.out.println("    R E S U L T A D O S    ");
		System.out.println("---------------------------");
		
		System.out.println("Promedio: " + df.format(promedio));
	}
}


