package ejemplos;

public class Fecha {
	private int dia;
	private String mes;
	private int anyo;
	
	public Fecha(int dia, String mes, int anyo) {
		this.dia=dia;
		this.mes=mes;
		this.anyo=anyo;
	}

	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anyo=" + anyo + "]";
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	

}
