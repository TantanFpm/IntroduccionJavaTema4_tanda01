package capicua;

public class NumCapic2 {
	private long num;
	private boolean esCapicua;
	
	public NumCapic2() {
		
	}
	
	public NumCapic2(long num) {
		this.num=num;
		esCapicua=esCapicua();
	}
	
	public  int contDigitos() {
		int contador=0;
		long aux=num;
		while(aux/10>0) {
			contador+=1;
			aux= aux/10;
			
		}
		contador+=1;
		return contador;
	}
	
	public int digitoEnPosicionN(int posicion) {
		int cifra;
		long aux=num;
		for (int i = 1; i < posicion; i++) {
			aux/=10;
		}
		cifra= (int) (aux%10);
		return cifra;
	}
	public boolean esCapicua() {
		boolean esCapicua=true;
		int totalDigitos=contDigitos();
		int inicio=1, fin=totalDigitos;
		while(inicio<=totalDigitos/2 && esCapicua) {
			if(digitoEnPosicionN(inicio)!=digitoEnPosicionN(fin))
				esCapicua=false;
			
			inicio+=1;
			fin-=1;
		}
		
		return esCapicua;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public boolean getEsCapicua() {
		return esCapicua;
	}

	public void setEsCapicua(boolean esCapicua) {
		this.esCapicua = esCapicua;
	}
	
	
	
}
