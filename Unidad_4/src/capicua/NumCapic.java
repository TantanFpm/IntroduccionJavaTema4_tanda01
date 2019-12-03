package capicua;

public class NumCapic {
	private long num;
	
	public NumCapic() {
		
	}
	
	public NumCapic(long num) {
		this.num=num;
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
		if(esCapicua)
			System.out.println("El numero " + num+ " es capicua");
		else
			System.out.println("El numero " + num+ " no es capicua");
		return esCapicua;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}
	
	
}
