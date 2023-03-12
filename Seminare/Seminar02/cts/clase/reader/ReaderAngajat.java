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
		Scanner scanner = new Scanner(new File(file));
		scanner.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();
		while (scanner.hasNext()) {
			Angajat angajat = new Angajat();
			super.readAplicant(angajat, scanner);
			angajat.setSalariu(scanner.nextInt());
			angajat.setOcupatie(scanner.next());
			angajati.add(angajat);
		}
		scanner.close();
		return angajati;
	}
	
}
