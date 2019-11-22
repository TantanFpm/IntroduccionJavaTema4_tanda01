package cuentaRojos;

public class CuentaBancaria {
	private String titular;
	private double saldo;
	private boolean numerosRojos;
	
	public CuentaBancaria(String titular) {
		this.titular=titular;
		this.saldo=0;
		this.numerosRojos=false;
		
	}
	
	public CuentaBancaria(String titular, double saldo) {
		this.titular=titular;
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
			System.out.println("Cuenta VIP: titular: " + titular + " saldo: " + saldo + "€");
		else if (numerosRojos)
			System.err.println(" Titular: " + titular + " saldo: " + saldo + "€ ¡Cuenta en números rojos!");
		else
			System.out.println("Titular: " + titular + " saldo: " + saldo + "€");
		
		}	
		
	

}
