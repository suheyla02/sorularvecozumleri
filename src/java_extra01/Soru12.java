package java_extra01;

import java.util.Scanner;

public class Soru12 {

	public static void main(String[] args) {

	    /*  Problem Tanımı
	        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
	        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
	        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

	        Örnek Ekran Çıktısı
	        Mesafeyi giriniz: 400
	        Hızı giriniz: 100
	        Süre 4 saattir.
	     */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Gidilecek il mesefesi(km):");
		int mesafe=scan.nextInt();
		System.out.println("Ortalama hiziniz(km/sa):");
		int hiz=scan.nextInt();
		
		int sure=(mesafe/hiz);
		
		System.out.println("Gidilecek yer " + sure + " saattir.");
		
		scan.close();

	}

}
