package tr.edu.medipol.yazilim.meryem.bolme;

import static org.junit.Assert.*;

import org.junit.Test;

import tr.edu.medipol.yazilim.meryem.carpma.Carpma;

public class BolmeTest {
	private Bolme bolme = new Bolme();


	@Test
	public void testIkiSayiyiBol() {
		int sayi1 = 50;
		int sayi2 = 10;
		int beklenenSonuc = 5;
		
		
		int sonuc = bolme.bol(sayi1, sayi2);
		
		
		assertEquals(beklenenSonuc, sonuc);
	}
	

}
