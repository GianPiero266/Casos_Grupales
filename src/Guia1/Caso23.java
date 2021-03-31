package Guia1;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso23 {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				DecimalFormat df = new DecimalFormat("#.00");
				
				System.out.print("Producto: ");
				String producto = sc.nextLine();
				
				System.out.print("Precio: ");
				float precio = sc.nextFloat();
				
				System.out.print("Cantidad: ");
				int cantidad = sc.nextInt();
				
				float importe = precio * cantidad;
				float igv = importe * 0.18f;
				float dscto = importe * 0.03f;
				float total = importe - dscto + igv;
				
				System.out.println("---------------------------");
				System.out.println("    R E S U L T A D O S    ");
				System.out.println("---------------------------");
				System.out.println("Importe: " + df.format(importe));
				System.out.println("IGV: " + igv);
				System.out.println("Descuento: " + dscto);
				System.out.println("Total: " + df.format(total));
			}
		}


