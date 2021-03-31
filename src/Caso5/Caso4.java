package Caso5;
import java.util.ArrayList;
import java.util.Scanner;

import com.senati.eti.modelo.Alumno;
import com.senati.eti.modelo.Publicacion;

public class Caso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		ArrayList<Publicacion> arrPublicacion = new ArrayList<Publicacion>();
		
		String titulo = "", autor = "", eleccion = "Si";
		int tipo = 0; 
		
		Publicacion pb1 = null;
		
		while (eleccion.equalsIgnoreCase("Si")) {
			
			System.out.println("REGISTRO DE DATOS");
			System.out.println("*****************");
			System.out.print("Título: ");
			titulo = a.nextLine();
			System.out.print("Autor: ");
			autor = a.nextLine();
			System.out.print("Tipo [1 / 2]: ");
			tipo = a.nextInt();
			
			pb1 = new Publicacion (titulo, autor, tipo);
	
			arrPublicacion.add(pb1);
			
			a.nextLine();
			
			System.out.print("\nDesea registrar otros datos [Si / No]: ");
			eleccion = a.nextLine();
			System.out.println("");

		}
		
		System.out.println("LISTA DE PUBLICACIONES");
		System.out.println("----------------------\n");
		
		String patron = "%-4s %-25s %-18s %-15s";
		System.out.println(String.format(patron, "N", "Título", "Autor", "Tipo"));
		System.out.println(String.format(patron, "--", "------", "-----", "----"));
		
		for (int x = 0; x < arrPublicacion.size(); x++)
			System.out.println(String.format(patron, (x + 1), arrPublicacion.get(x).getTitulo(),
							arrPublicacion.get(x).getAutor(), arrPublicacion.get(x).MostrarTipo()));
	}

}

