package cts.clase;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctajObtinut;
	protected int nrProiecte;
	protected String[] denumireProiect;
	protected static int pragAcceptare = 10;
	
	public Aplicant() {
		super();
	}
	
	public static int getPragAcceptare() {
		return pragAcceptare;
	}

	public static void setPragAcceptare(int pragAcceptare) {
		Aplicant.pragAcceptare = pragAcceptare;
	}

	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public String getPrenume() {
		return prenume;
	}
	
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	
	public int getVarsta() {
		return varsta;
	}
	
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	
	public void afisareStatus() {
		System.out.println("Aplicantul " + nume + " " + prenume + 
				(punctajObtinut > pragAcceptare ? "" : " nu ") + 
				" a fost acceptat.");
	}
	
	public int getPunctaj() {
		return punctajObtinut;
	}
	
	public void setPunctaj(int punctaj) {
		this.punctajObtinut = punctaj;
	}
	
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctajObtinut = punctaj;
		this.nrProiecte = nr_proiecte;
		this.denumireProiect = denumireProiect;
	}
	
	public int getNr_proiecte() {
		return nrProiecte;
	}
	
	public void setNr_proiecte(int nr_proiecte, String[] proiecte) {
		this.nrProiecte = nr_proiecte;
		this.denumireProiect = new String[this.nrProiecte];
		for(int i = 0; i < this.nrProiecte; i++) {
			this.denumireProiect[i] = proiecte[i];
		}
	}

	public abstract void afisareSumaFinantare();
	
	protected void afisareSumaFinantare(String tipAplicant, int sumaFinantare) {
		System.out.println(tipAplicant + getNume() + " " + getPrenume() + " primeste " + sumaFinantare + " Euro/zi in proiect.");
	}
}
