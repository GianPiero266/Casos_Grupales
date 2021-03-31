package Guia1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese Monto 1: ");
		float monto1 = sc.nextFloat();
		
		System.out.print("Ingrese Monto 2: ");
		float monto2 = sc.nextFloat();
		
		System.out.print("Ingrese Monto 3: ");
		float monto3 = sc.nextFloat();
		
		float rpta1 = (monto1 / 5) + (monto2 *0.2f);
		float rpta2 = (monto3 + (monto3 * 0.6f)) / 2;
		float rpta3 = (monto1 + monto2 + monto3) - ((monto1 + monto2 + monto3) * 0.08f);
		
		System.out.println("\n--- R E S U L T A D O S ---");
		System.out.println("Respuesta 1: " + df.format(rpta1));
		System.out.println("Respuesta 2: " + df.format(rpta2));
		System.out.println("Respuesta 3: " + df.format(rpta3));
	}
}
