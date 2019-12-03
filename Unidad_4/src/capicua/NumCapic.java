package capicua;

public class NumCapic {
	private long num;
	
	public NumCapic() {
		
	}
	
	public NumCapic(long num) {
		this.num=num;
	}
	
	public  int contDigitos(long num) {
		int contador=0;
		long aux=num;
		while(aux/10>0) {
			contador+=1;
			aux= aux/10;
			
		}
		contador+=1;
		return contador;
	}
	
	public int digitoEnPosicionN(long num, int posicion) {
		int cifra;
		long aux=num;
		for (int i = 1; i < posicion; i++) {
			aux/=10;
		}
		cifra= (int) (aux%10);
		return cifra;
	}
	public boolean esCapicua(long num) {
		boolean esCapicua=true;
		int totalDigitos=contDigitos(num);
		int inicio=1, fin=totalDigitos;
		while(inicio<totalDigitos/2 && esCapicua) {
			if(digitoEnPosicionN(num, inicio)!=digitoEnPosicionN(num, fin))
				esCapicua=false;
			
			inicio+=1;
			fin-=1;
		}
		
		return esCapicua;
	}
}
