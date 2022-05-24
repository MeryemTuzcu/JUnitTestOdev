package tr.edu.medipol.yazilim.meryem.toplama;

public class Toplama {

	static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	static int topla(int ... sayilar) {
		int toplamSonuc = 0;
		for (int sayi : sayilar) {
			toplamSonuc += sayi;
		}
		return toplamSonuc;
	}
	
	
	public static void main(String[] args) {
		
		int sonuc = topla(243,654);
		
		// System.out.printf("%d + %d = %d %n",243,654, sonuc);
		
		System.out.println("243 + 654 = " + sonuc);
		
	}

}
