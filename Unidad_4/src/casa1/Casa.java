package casa1;

public class Casa {
	private String direccion;
	private double superficie;
	private char tipo;
	
	
	public void mostrar() {
		if (tipo=='p')
			System.out.println( "Piso en " + direccion + ", superficie:" + superficie + "m2");
		else
			System.out.println( "Casa en" + direccion + ", superficie:" + superficie + "m2");
			
	}
	
	public double dameImpuesto() {
		if (superficie <60) 
			return 0.0;
			else if(superficie >=60 && superficie<=80)
				return superficie*4.5;
			else 
				return superficie*5.5;
		
		
	}
	
	public boolean esVendible() {
		if (tipo=='u' ||superficie>100)
			return true;
		else
			return false;
		
	}
	
	public boolean esSimilar(Casa C1) {

		if ((C1.tipo == tipo && (C1.superficie - this.superficie <= 10 && C1.superficie - this.superficie>=-10)))
			
			return true;
		else
			return false;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	
	
	

}
