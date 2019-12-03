package capicua;

public class Main {

	public static void main(String[] args) {
		int n=2365;
		System.out.println(n%10);
		System.out.println(n/10);
		int cifra;
		long aux=n;
		for (int i = 1; i < 2; i++) {
			aux/=10;
		}
		cifra= (int) (aux%10);
		System.out.println(cifra);
		
	}

}
