package Singleton;

public class Main {
	
	public static void main(String[] args) {
		
//		Single s = new Single(); NAO COMPILA
		
		Single s = Single.getInstance();
		
		s.setMessage("Teste do Padr�o Singleton.");
		
		Single s1 = Single.getInstance(); //Deve retornar s
		
		if(s == s1) {
			System.out.println("s e s1 s�o o mesmo objeto.");
			System.out.println(s);
			System.out.println(s1);
		}
		
	}

}