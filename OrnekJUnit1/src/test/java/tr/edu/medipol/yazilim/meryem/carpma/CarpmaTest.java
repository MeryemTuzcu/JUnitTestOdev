package tr.edu.medipol.yazilim.meryem.carpma;

import static org.junit.Assert.*;

import org.junit.Test;

import tr.edu.medipol.yazilim.meryem.cikarma.Cikarma;

public class CarpmaTest {
	private Carpma carpma = new Carpma();


	@Test
	public void testIkiSayiyiCarp() {
		int sayi1 = 5;
		int sayi2 = 10;
		int beklenenSonuc = 50;
		
		// WHEN - Islem/Aksiyon gerceklestiginde
		int sonuc = carpma.carp(sayi1, sayi2);
		
		// THEN - Islem sonrasi kontroller
		assertEquals(beklenenSonuc, sonuc);
	}

}
