package cts.singleton.registry;

public class Firma {
	private String nume;
	private int nrAngajati;
	
	protected Firma(String nume, int nrAngajati) {
		super();
		this.nume = nume;
		this.nrAngajati = nrAngajati;
	}

	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public int getNrAngajati() {
		return nrAngajati;
	}
	
	public void setNrAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}

	@Override
	public String toString() {
		return "Firma [nume=" + nume + ", nrAngajati=" + nrAngajati + "]";
	}
	
	public void angajeaza() {
		this.nrAngajati++;
	}
}
