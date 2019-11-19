package cuenta1;

public class CuentaBancaria {
	private String titular;
	private double saldo;
	
	public CuentaBancaria(String titular) {
		this.titular=titular;
		this.saldo=0;
		
	}
	
	public CuentaBancaria(String titular, double saldo) {
		this.titular=titular;
		this.saldo=saldo;
	}
	
	public void ingresar(double ingreso) {
		saldo+=ingreso;
	}
	
	public void gastar(double gasto) {
		if (gasto > saldo)
			System.out.println("Error, saldo insuficiente");
		else
			saldo -= gasto;
	}
	
	public void ver() {
		if(saldo>1000000)
			System.out.println("Cuenta VIP: titular: " + titular + " saldo: " + saldo + "€");
		else
			System.out.println("Titular: " + titular + " saldo: " + saldo + "€");
	
	}
	

}
