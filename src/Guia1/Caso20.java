package Guia1;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Precio: ");
		float precio = sc.nextFloat();
		
		System.out.print("Cantidad: ");
		int cantidad = sc.nextInt();
		
		float venta = precio * cantidad;
		float incremento = venta + (venta * 0.42f);
		
		System.out.println("--------------------------");
		System.out.println("    R E S U L T A D O S    ");
		System.out.println("---------------------------");
		System.out.println("Valor de la venta: " + df.format(venta));
		System.out.println("Valor incrementado: " + df.format(incremento));

	}

}

