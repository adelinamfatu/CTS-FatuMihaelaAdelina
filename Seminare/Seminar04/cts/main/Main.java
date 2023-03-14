package cts.main;

import cts.singleton.registry.Firma;
import cts.singleton.registry.Registru;

public class Main {

	public static void main(String[] args) {
		Registru registru = new Registru();
		Registru registruNou = new Registru();
		
		Firma firma1 = registru.getFirma("Suvoda SRL");
		Firma firma2 = registru.getFirma("Google SRL");
		Firma firma3 = registruNou.getFirma("Google SRL");
		firma1.angajeaza();
		firma2.angajeaza();
		firma3.angajeaza();
		
		System.out.println(firma1.toString());
		System.out.println(firma2.toString());
		System.out.println(firma3.toString());
		
		//Firma firma4 = new Firma("Suvoda SRL", 0);
		//System.out.println(firma4.toString());
	}
}