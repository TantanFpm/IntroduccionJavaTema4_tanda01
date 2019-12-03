package biblioStatic;

import java.util.Scanner;


public class BiblioStatic {
	
	public static void multiplo5(int limite1, int limite2) {
		int buscaMultiplo5=limite1;
		while(buscaMultiplo5%5!=0)
			buscaMultiplo5+=1;
		if (buscaMultiplo5>limite2 || (buscaMultiplo5==limite2 && buscaMultiplo5%5!=0) ) {
			System.out.println("No hay multiplos de 5 entre estos dos numeros");
		}
		while(buscaMultiplo5<=limite2) {
			System.out.print(buscaMultiplo5 + "\t");
			buscaMultiplo5+=5;
		}
		System.out.println("\n");
		
	}
	
	public static int tipoCaracter(char caracter) {
		if(caracter>=65 && caracter<=90)
			return 1;
		else if(caracter>=97 && caracter<=122)
			return 2;
		else
			return -1;
	}
	
	public static double calcularPotecia(double x, int n) {
		return Math.pow(x, n);
	}
	
	public static int sumatorio(int x) {
		int sumatorio=0;
		for(int i=0; i<=x; i++) {
			sumatorio+=i;
		}
		return sumatorio;
	}
	
	public static void verTabla(int multiplicando) {
		
		for (int i=1; i<=10; i++) {
			
			System.out.println(multiplicando + "x" + i + "=" + multiplicando*i);
		}
	}
	
public static void verTablaRestringida(int multiplicando) {
		if (multiplicando>=1 &&multiplicando<=20) {
			System.out.println("Se puede visualizar la tabla del " + multiplicando);
			for (int i=1; i<=10; i++) {
			
			System.out.println(multiplicando + "x" + i + "=" + multiplicando*i);
		}
		}else
			System.out.println("No se puede visualizar la tabla del " + multiplicando);
		
	}

	/**
	 * Pruebas
	 *
	 */
	
	
	public static void main(String[] args) {
		int num1, num2, n;
		double x=7;
		char caracter;

		do {
			do {

				System.out.println("Introduce un numero positivo");
				num1 = Consola.leeInt();

				do {

					System.out.println("Introduce otro numero mayor que el anterior");
					num2 = Consola.leeInt();

				} while (num2 <= num1);

			} while (num1 < 0 || num2 < 0);
			if (num1 != 0 && num2 != 0)
				BiblioStatic.multiplo5(num1, num2);

		} while (num1 != 0 && num2 != 0);
	
		
		for(int i=1; i<=5; i++) {
			System.out.println("Introduce un caracter");
			caracter=Consola.leeChar();
			if(BiblioStatic.tipoCaracter(caracter)==1)
				System.out.println("Es mayúscula");
			else if(BiblioStatic.tipoCaracter(caracter)==2)
				System.out.println("Es minuscula");
			else
				System.out.println("No es una letra");
		}	
		
		do {
			System.out.println("Introduce un numero");
			 n=Consola.leeInt();
		} while (n<0);
		
		for(int i=0; i<=n; i++) {
			System.out.print(BiblioStatic.calcularPotecia(x, i) +"\t");
		}
		System.out.println();
		double resultado=0;
		do {
			System.out.println("Introduce un valor para la x");
			x=Consola.leeDouble();
		} while (x<=0);
		for (int i = 1; i <=8; i++) {
			resultado+=(BiblioStatic.calcularPotecia(x, i)/BiblioStatic.sumatorio(i));
		}
		System.out.println(resultado);
		
		int num;
		do {
			System.out.println("Introduce un numero");
			num=Consola.leeInt();
		} while (num<=0 || num>10);
		BiblioStatic.verTabla(num);
		int nume;
		do {
			System.out.println("Introduce un número para visualzar la tabla de multiplicar, debe ser entre uno y veinte");
			nume=Consola.leeInt();
			switch (nume) {
			case 0:
				
				break;

			default:
				BiblioStatic.verTablaRestringida(nume);
				break;
			}
		} while (nume!=0);
		
	}

}
