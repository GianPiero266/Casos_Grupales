package Guia2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Trabajador: ");
		String nombre = sc.nextLine();
		
		System.out.print("Horas trabajadas: ");
		float horas_trabajadas = sc.nextFloat();
		
		System.out.print("Tarifa por horas: ");
		float tarifa = sc.nextFloat();
		
		System.out.print("Minutos de tardanza: ");
		int minutos = sc.nextInt();
		
		float importe = horas_trabajadas * tarifa;
		
		float bono = 0;
		
		if (horas_trabajadas > 60)
			bono = importe * 0.13f;
		else
			bono = importe * 0.04f;
		
		float dscto = 0;
		
		if (minutos > 15)
			dscto = importe * 0.03f;
		
		float pa = horas_trabajadas / 70 * 100;
		
		System.out.println("\n--- R E S U L T A D O S ---");
		System.out.println("Trabajador: " + nombre.toUpperCase());
		System.out.println("Horas trabajadas: " + horas_trabajadas);
		System.out.println("Tarifa por hora: " + tarifa);
		System.out.println("Minutos de tardanza: " + minutos);
		System.out.println("Importe: " + df.format(importe));
		System.out.println("Bono: " + df.format(bono));
		System.out.println("Descuento: " + dscto);
		System.out.println("Meta alcanzada: " + df.format(pa) + "%");
	}
}


