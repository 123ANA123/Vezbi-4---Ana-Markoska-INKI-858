package Zadaca4;

public class Main {

	public static void main(String[] args) {
		Avtomobil avtomobil = new Avtomobil("Mazda", "6", 20000, "crna");

		System.out.println("Marka: " + avtomobil.getMarka());
		System.out.println("Model: " + avtomobil.getModel());
		System.out.println("Kilometri pred mnozhenje: " + avtomobil.getPominatiKm());
		System.out.println("Kilometri posle mnozhenje: " + avtomobil.mnozenjeKm(5));
		System.out.println("Boja: " + avtomobil.getBoja());
	}
}
