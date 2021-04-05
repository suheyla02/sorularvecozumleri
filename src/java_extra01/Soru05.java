package java_extra01;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
		 /*
        TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
         */
		Scanner scan=new Scanner(System.in);
		System.out.println("\"TechProEd spor salonuna hosgeldiniz\"");
		System.out.println("Isim:");
		String isim=scan.nextLine();
		System.out.println("Soyisim:");
		String soyisim=scan.next();
		System.out.println("Yas:");
		int yas=scan.nextInt();
		System.out.println("kilo:");
		double kilo=scan.nextDouble();
		System.out.println("Boy:");
		double boy=scan.nextDouble();
		System.out.println("Kac aylik kaydolacaksiniz:");
		int sure=scan.nextInt();
		
		int aylikUcret=20;
		int toplam=sure*aylikUcret;
		
		System.out.println("Odeyeceginiz toplam ucret:"+ toplam+"TL");

	}

}
