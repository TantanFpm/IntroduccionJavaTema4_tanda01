package ejemplos;

public class AlumnoDep extends Alumno {

	private String deporte;
	private int record;

	public AlumnoDep(Fecha fechaNacimiento, String nombre, String deporte, int record) {
		super(fechaNacimiento, nombre);
		this.deporte = deporte;
		this.record = record;

	}

	public AlumnoDep(int dia, String mes, int anyo, String nombre, String deporte, int record) {
		super(dia, mes, anyo, nombre);
		this.deporte = deporte;
		this.record = record;

	}

	@Override
	public String toString() {
		return super.toString() + " deporte=" + deporte + ", record=" + record;
	}

	public boolean esJoven() {
		if (((deporte.toUpperCase().equals("NATACION")) || (deporte.toUpperCase().equals("TENIS"))) && super.esJoven())
			return true;
		else if (getFechaNacimiento().getAnyo() > 2004 && record>10)
			return true;
		else
			return false;
	}
	
	public AlumnoDep alumMejorRecord(AlumnoDep alum1) {
		if(alum1.deporte.toLowerCase().equals(deporte.toLowerCase()) &&  alum1.record>record)
			return alum1;
		else if(alum1.deporte.toLowerCase().equals(deporte.toLowerCase()) && record>alum1.record)
			return this;
		else
			return null;
	}
	
	public void cambiaRecord(int nuevoRecord) {
		record=nuevoRecord;
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public int getRecord() {
		return record;
	}

	public void setRecord(int record) {
		this.record = record;
	}

}
