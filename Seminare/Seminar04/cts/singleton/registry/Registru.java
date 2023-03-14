package cts.singleton.registry;

import java.util.HashMap;
import java.util.Map;

public class Registru {
	private static Map<String, Firma> registru = new HashMap<>();
	
	public Firma getFirma(String nume) {
		if(!registru.containsKey(nume)) {
			Firma firma = new Firma(nume, 0);
			registru.put(nume, firma);
		}
		return registru.get(nume);
	}
}
