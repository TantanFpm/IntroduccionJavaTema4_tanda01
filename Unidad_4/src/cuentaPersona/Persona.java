package cuentaPersona;

public class Persona {
	private String nombre;
	private int edad;
	private char sexo;
	
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
