package cts.clase.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cts.clase.Aplicant;
import cts.clase.Elev;

public class ReaderElev extends ReaderAplicant {
	@Override
	public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(file));
		scanner.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (scanner.hasNext()) {
			Elev elev = new Elev();
			super.readAplicant(elev, scanner);
			elev.setClasa(scanner.nextInt());
			elev.setTutore(scanner.next());
			
			elevi.add(elev);
		}

		scanner.close();
		return elevi;
	}
}
