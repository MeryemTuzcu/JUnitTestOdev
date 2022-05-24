package tr.edu.medipol.yazilim.meryem.cikarma;

import static org.junit.Assert.*;

import org.junit.Test;

import tr.edu.medipol.yazilim.meryem.toplama.Toplama;

public class CikarmaTest {
	
	private Cikarma cikarma = new Cikarma();

	@Test
	public void testIkiSayiyiCikar() {

		


			// GIVEN - On sartlar / Verilenler
			int sayi1 = 500;
			int sayi2 = 150;
			int beklenenSonuc = 350;
			
			// WHEN - Islem/Aksiyon gerceklestiginde
			int sonuc = cikarma.cikar(sayi1, sayi2);
			
			// THEN - Islem sonrasi kontroller
			assertEquals(beklenenSonuc, sonuc);
		
	}

}
