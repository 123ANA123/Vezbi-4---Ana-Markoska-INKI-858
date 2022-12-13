package Zadaca1;

public class Main {

	public static void main(String[] args) {
		Covek c = new Covek ();
		c.setIme("Ana");
		c.setPrezime("Markoska");
		c.setEmbg("0502999480004");
		
		System.out.println("Ime: " + c.getIme());
		System.out.println("Prezime: " + c.getPrezime());
		System.out.println("EMBG: " + c.getEmbg());
	}
}

