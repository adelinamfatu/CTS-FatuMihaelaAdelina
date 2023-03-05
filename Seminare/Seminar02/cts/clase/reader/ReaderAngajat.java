package cts.clase.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cts.clase.Angajat;
import cts.clase.Aplicant;

public class ReaderAngajat extends ReaderAplicant{

	@Override
	public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(file));
		input2.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			String nume = input2.next();
			String prenume = input2.next();
			int varsta = input2.nextInt();
			int punctaj = input2.nextInt();
			int nrProiecte = input2.nextInt();
			String[] proiecte = new String[5];
			for (int i = 0; i < nrProiecte; i++)
				proiecte[i] = input2.next();
			int salariu = input2.nextInt();
			String ocupatie = input2.next();
			Angajat a = new Angajat(nume, prenume, varsta, punctaj, nrProiecte, proiecte, salariu, ocupatie);
			angajati.add(a);
		}
		input2.close();
		return angajati;
	}
	
}
