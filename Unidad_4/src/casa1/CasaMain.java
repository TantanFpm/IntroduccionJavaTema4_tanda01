package casa1;

 
public class CasaMain {

	public static void main(String[] args) {
		Casa c1 = new Casa();
		c1.setDireccion("C/Rioja, 18");
		c1.setSuperficie(65);
		c1.setTipo('p');
		Casa c2 = new Casa();
		c2.setDireccion("C/Alava, 5");
		c2.setSuperficie(150);
		c2.setTipo('u');

		Casa c3 = new Casa();
		c3.setDireccion("C/Gorbea, 23");
		c3.setSuperficie(105.5);
		c3.setTipo('p');

		c1.mostrar();
		c2.mostrar();
		c3.mostrar();

		c2.setSuperficie(c2.getSuperficie() - 5);

		c1.mostrar();
		c2.mostrar();
		c3.mostrar();

		System.out.println("El impuesto de la casa1 es: " + c1.dameImpuesto() + "€ \nEl impuesto de la casa 2 es: "
				+ c2.dameImpuesto() + "€ \nEl impuesto de la casa3 es: " + c3.dameImpuesto() + "€");
		
		
		if(c1.esVendible())
			System.out.println("La casa1 es vendible");
		if(c2.esVendible())
			System.out.println("La casa2 es vendible");
		if(c3.esVendible())
			System.out.println("La casa3 es vendible");
		
		if(c2.esSimilar(c3))
			System.out.println("La casa 2 es similar a la casa 3");
		else
			System.out.println("Las casas dos y tres no son similares");
		
		if(c1.esSimilar(c3))
			System.out.println("La casa 1 es similar a la casa 3");
		else
			System.out.println("Las casas uno y tres no son similares");
		
		c1.setSuperficie(c1.getSuperficie()+35);
		if(c1.esSimilar(c3))
			System.out.println("La casa 1 es similar a la casa 3");
		else
			System.out.println("Las casas uno y tres no son similares");
		
		
	}
	
	

}
