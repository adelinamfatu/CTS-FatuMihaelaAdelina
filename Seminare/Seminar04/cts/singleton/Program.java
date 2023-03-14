package cts.singleton;

public class Program {

	public static void main(String[] args) {
		Rector rector = Rector.getInstanta("Enescu", 2, 45);
		Rector rectorTest = Rector.getInstanta("Popescu", 1, 35);
		System.out.println(rector.toString());
		System.out.println(rectorTest.toString());
		
		Decan decan = Decan.getInstanta();
		Decan decanTest = Decan.getInstanta();
		decanTest.setNume("Vasilescu");
		System.out.println(decan.getNume());
		System.out.println(decanTest.getNume());
		
		Firma firma1 = Firma.getInstanta("Almette SRL");
		Firma firma2 = Firma.getInstanta("Suvoda SRL");
		Firma firma3 = Firma.getInstanta("Almette SRL");
		firma1.setNrAngajati(5);
		firma2.setNrAngajati(20);
		firma3.setNrAngajati(8);
		System.out.println(firma1.toString());
		System.out.println(firma2.toString());
		System.out.println(firma3.toString());
	}
}