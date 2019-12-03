package capicua;

import biblioStatic.Consola;

public class Main {

	public static void main(String[] args) {
		long n;
		
			System.out.println("Introduce un número");
			n=Consola.leeLong();
			NumCapic2 nc1 = new NumCapic2(n);
			
			System.out.println("Introduce un número");
			n=Consola.leeLong();
			NumCapic2 nc2 = new NumCapic2(n);
		
			System.out.println("Introduce un número");
			n=Consola.leeLong();
			NumCapic2 nc3 = new NumCapic2(n);
			
			System.out.println("Introduce un número");
			n=Consola.leeLong();
			NumCapic2 nc4 = new NumCapic2(n);
			
			System.out.println("Introduce un número");
			n=Consola.leeLong();
			NumCapic2 nc5 = new NumCapic2(n);
			
		/*	nc1.esCapicua();
			nc2.esCapicua();
			nc3.esCapicua();
			nc4.esCapicua();
			nc5.esCapicua();*/
			System.out.println(nc1.getEsCapicua());
			System.out.println(nc2.getEsCapicua());
			System.out.println(nc3.getEsCapicua());
			System.out.println(nc4.getEsCapicua());
			System.out.println(nc5.getEsCapicua());
		
	}

}
