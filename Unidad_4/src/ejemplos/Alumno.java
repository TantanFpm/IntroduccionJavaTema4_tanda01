package ejemplos;

public class Alumno {
	private Fecha fechaNacimiento;
	private String nombre;
	
	public Alumno (Fecha fechaNaciminto, String nombre) {
		this.fechaNacimiento= fechaNaciminto;
		this.nombre=nombre;
	}
	
	public Alumno(int dia, String mes, int anyo, String nombre) {
		fechaNacimiento= new Fecha(dia, mes, anyo);
		this.nombre=nombre;
	}

	@Override
	public String toString() {
		return "Alumno: nombre=" + nombre + " fechaNacimiento=" + fechaNacimiento;
	}
	
	public boolean esJoven() {
		if(fechaNacimiento.getAnyo()>2000) 
			return true;
		else
			return false;
		
		
		
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
