package Zadaca2;

public class Main {

	public static void main(String[] args) {
		Restoran rest = new Restoran();
		rest.setIme("Skar");
		rest.setLokacija("Krusevo");
		rest.setTelefon("048 255 -522");
		rest.setBrSedishta(100);
		
		System.out.println("Restoranot " + rest.getIme() + " koj se naogja vo " + rest.getLokacija() + " ima broj za kontakt: " + rest.getTelefon());
		System.out.println("Vo restoranot ima kapacitet od: " + rest.getBrSedishta() + " sedista.");
	}
}
