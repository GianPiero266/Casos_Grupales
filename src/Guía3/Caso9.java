package Guía3;

import java.util.Scanner;

public class Caso9 {
	public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
      
        String continuar="S" ,n="",n_m="",n_ma="";
        int contador=0, ac=0, anc=0;
        float num_mayor=0, num_menor=99999999, p=0;
      
        while (continuar.equals("s") || continuar.equals("S") ) {
            	    contador++; 	   
             	    System.out.println("Registro " + contador + " :");
             	    System.out.println("Nombre del alumno: ");
                    n = sc.nextLine();
                    System.out.println("Nota 1: ");
                    float n1= sc.nextFloat();
                    System.out.println("Nota 2: ");
                    float n2= sc.nextFloat();
                    System.out.println("Nota 3: ");
                    float n3=sc.nextFloat();
                    System.out.println("Ingrese el número de asistencias [1-12]: ");
                    float a=sc.nextFloat();
                    System.out.println("------RESULTADOS------");
             	    p = (n1+n2+n3)/3;
             	    float asis=(a/12)*100;
             	    System.out.println("Promedio: " + p);
             	    System.out.println("Asistencias: " + asis + " %");
             	    if (p>=13 && asis>=70 ) {
             	    	ac++;
             		    System.out.println("Estado: Obtiene Certificado");
             		    System.out.println("---------------------------");
             	    }
             	    else {
             	    	anc++;
             		    System.out.println("Estado: Sin Certificado");
             		    System.out.println("---------------------------"); 
             	    }   
             		if (p>num_mayor) {
               	    	num_mayor=p;
               	    	n_ma=n;	
               	    }
               	    if (p<num_menor) {
               	    	num_menor=p;
               	    	n_m=n;	
               	    }
             	   sc.nextLine();
             	   System.out.println("Desea continuar [S]/[N]");
             	   continuar=sc.nextLine();
                   }
                   System.out.println("-----RESUMEN-----");
                   System.out.println("Alumnos registrados: " + contador);
                   System.out.println("Promedio mayor: " + num_mayor + " pertenece a: " + n_ma);
                   System.out.println("Promedio menor: " + num_menor + " pertenece a: " + n_m);
                   System.out.println("Número de alumnos certificados: " + ac);
                   System.out.println("Número de alumnos sin certificado: " + anc);
                   
                   
                   } 
}
   