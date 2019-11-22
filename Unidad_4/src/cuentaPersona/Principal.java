package cuentaPersona;

public class Principal {

	public static void main(String[] args) {
		CuentaBancaria c1= new CuentaBancaria("Juan López");
		CuentaBancaria c2= new CuentaBancaria("Ana Aguirre");
		CuentaBancaria c3= new CuentaBancaria("Jorge Gil", 800);
		
		
		c1.ver();
		c2.ver();
		c3.ver();
		
		c1.ingresar(500);
		c2.ingresar(2000);
		c3.ingresar(100);
		
		c1.ver();
		c2.ver();
		c3.ver();
		
		c1.gastar(100);
		c2.gastar(100);
		c3.gastar(100);
		
		c1.ver();
		c2.ver();
		c3.ver();
		
		c1.gastar(500);
		c2.gastar(500);
		c3.gastar(500);
		
		c1.ver();
		c2.ver();
		c3.ver();
		
		c3.ingresar(2000000);
		
		c1.ver();
		c2.ver();
		c3.ver();
		
		c3.gastar(100);
		c1.ingresar(100);
		
		c1.ver();
		c2.ver();
		c3.ver();
		
		
	}

}
