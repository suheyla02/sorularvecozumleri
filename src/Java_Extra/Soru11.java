package Java_Extra;

import java.util.Scanner;

public class Soru11 {

	public static void main(String[] args) {
		 /*  Problem Tanımı
        bir dik üçgenin iki dik kenarı girildiğinde, bu üçgenin alanını ve çevresini
        hesaplayan kodu yazınız.

        Örnek Ekran Çıktısı
        Birinci Kenarı Giriniz: 3
        İkinci Kenarı Giriniz: 4
        Üçgenin alanı : 6
        Üçgenin çevresi: 12
         */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen ucgenin dik a kenarini giriniz:");
		double a=scan.nextDouble();
		System.out.println("Lutfen ucgenin dik b kenarini giriniz:");
		double b=scan.nextDouble();
		
		double c=Math.sqrt((a*a)+(b*b));
		
		System.out.println("Ucgenin cevresi:" + (a+b+c));
		System.out.println("Ucgenin alani:" + (a*b)/2);

		scan.close();
	}

}
