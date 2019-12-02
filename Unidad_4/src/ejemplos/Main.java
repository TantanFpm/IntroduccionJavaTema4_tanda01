package ejemplos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlumnoDep al2=new AlumnoDep(10, "mayo", 2005, "Silvia", "natacion", 6);
		AlumnoDep al1=new AlumnoDep(5, "junio", 2005, "Leire", "esgrima", 11);
		
		System.out.println(al1.alumMejorRecord(al2));
		
		System.out.println(al1.esJoven());
		System.out.println(al2.esJoven());
		
		al1.cambiaRecord(20);
		
		System.out.println(al1.toString());
		
	}

}
