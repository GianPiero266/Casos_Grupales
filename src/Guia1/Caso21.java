package Guia1;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Precio: ");
		float precio = sc.nextFloat();
		
		System.out.print("Cantidad: ");
		int cantidad = sc.nextInt();
		
		float gasto = precio * cantidad;
		float disminuir = gasto - (gasto * 0.12f);
		
		System.out.println("---------------------------");
		System.out.println("    R E S U L T A D O S    ");
		System.out.println("---------------------------");
		System.out.println("Gasto: " + df.format(gasto));
		System.out.println("Valor disminuido: " + df.format(disminuir));
	}
}
