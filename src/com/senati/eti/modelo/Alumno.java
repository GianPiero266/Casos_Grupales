package com.senati.eti.modelo;

public class Alumno {
	private String nombre;
	private String apellido;
	private String genero;
	private int edad;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Alumno() {
		super();
	}

	public Alumno(String nombre, String apellido, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.edad = edad;
	}
	
	public String NombreCompleto() {
		return this.nombre + " " + this.apellido;
	}
	
	public String MostrarGenero() {
        /*
		String m = "";
        
        if (this.genero.equals("F"))
        	m = "Femenino";
        else if (this.genero.equals("M"))
        	m = "Masculino";
        
        return m;
        */
		return (this.genero.equals("F") ? "Femenino" : "Masculino");
	}
	
	public String MostrarEstado() {
		return (this.edad >=18 ? "Mayor de edad" : "Menor de edad");
		
	}
}
