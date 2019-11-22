package cuentaPersona;

public class CuentaBancaria {
	private Persona titular;
	private double saldo;
	private boolean numerosRojos;
	
	public CuentaBancaria(String nombre, int edad, char sexo) {
		this.titular=new Persona(nombre, edad, sexo);
		this.saldo=0;
		this.numerosRojos=false;
		
	}
	
	public CuentaBancaria(String nombre) {
		this.titular=new Persona(nombre);
		this.saldo=0;
		this.numerosRojos=false;
		
	}
	
	public CuentaBancaria(String nombre, int edad, char sexo, double saldo) {
		this.titular= new Persona(nombre, edad, sexo);
		this.saldo=saldo;
		this.numerosRojos=false;
	}
	
	public CuentaBancaria(String nombre, double saldo) {
		this.titular= new Persona(nombre);
		this.saldo=saldo;
		this.numerosRojos=false;
	}
	
	public void ingresar(double ingreso) {
		saldo+=ingreso;
		if(saldo>=0)
			numerosRojos=false;
	}
	
	public void gastar(double gasto) {
		if (gasto > saldo)
			numerosRojos=true;
		saldo -= gasto;
	}
	
	public void ver() {
		if(saldo>1000000)
			System.out.println("Cuenta VIP: titular: " + titular.getNombre() + " saldo: " + saldo + "€");
		else if (numerosRojos)
			System.err.println(" Titular: " + titular.getNombre() + " saldo: " + saldo + "€ ¡Cuenta en números rojos!");
		else
			System.out.println("Titular: " + titular.getNombre() + " saldo: " + saldo + "€");
		
		}	
		
	

}
