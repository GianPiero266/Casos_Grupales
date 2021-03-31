package Guia2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso8 {
      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
    	  DecimalFormat df = new DecimalFormat("#.00");
    	  
    	  System.out.println("Ingrese nombre del(a) alumno(a): ");
    	  String nombre = sc.nextLine();
    	  
    	  System.out.println("Ingrese nota 1: ");
    	  float n1 = sc.nextFloat();
    	  
    	  System.out.println("Ingrese nota 2: ");
    	  float n2 = sc.nextFloat();
    	  
    	  System.out.println("Ingrese número de asistencias [1-12].: ");
    	  float asistencia = sc.nextFloat();
    	  
    	  float promedio = n1 * 0.3f + n2 * 0.7f;
    	  float pa = asistencia / 12 * 100;
    	  
    	  String estado = "Desaprobado";
    	  
    	  if (promedio >= 13 && pa >= 70)
    		  estado = "Aprobado";
    	  
    	  System.out.println("\n---Resultados---");
    	  System.out.println("Alumno(a)....: " + nombre.toUpperCase());
    	  System.out.println("Promedio....: " + df.format(promedio));
    	  System.out.println("Asistencia...: " + df.format(pa) + "%");
    	  System.out.println("Estado....: " + estado);
     
    			  
      }
}

