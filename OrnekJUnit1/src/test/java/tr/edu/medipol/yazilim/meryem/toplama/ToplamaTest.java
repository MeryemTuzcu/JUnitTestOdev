package tr.edu.medipol.yazilim.meryem.toplama;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToplamaTest {

private Toplama toplama = new Toplama();
	
	@Test
	public void testIkiSayiyiTopla() {
		// GIVEN - On sartlar / Verilenler
		int sayi1 = 435;
		int sayi2 = 534;
		int beklenenSonuc = 969;
		
		// WHEN - Islem/Aksiyon gerceklestiginde
		int sonuc = toplama.topla(sayi1, sayi2);
		
		// THEN - Islem sonrasi kontroller
		assertEquals(beklenenSonuc, sonuc);
	}
	
	@Test
	public void testDortSayiyiTopla() {
		// GIVEN - On sartlar / Verilenler
		int sayi1 = 435;
		int sayi2 = 534;
		int sayi3 = 1;
		int sayi4 = 2;
		int beklenenSonuc = 972;
		
		// WHEN - Islem/Aksiyon gerceklestiginde
		int sonuc = toplama.topla(sayi1, sayi2, sayi3, sayi4);
		
		// THEN - Islem sonrasi kontroller
		assertEquals(beklenenSonuc, sonuc);
	}
}
