package java_extra01;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		 /* Problem Tanımı
        Kullanıcıdan iki tarih okuyarak bu tarihler arasında kaç gün geçtiğini
        hesaplaya kodu yazınız. Örnek olarak kendi doğum tarihinizi ve
        bugünün tarihini girerek kaç gündür yaşadığınızı hesaplayınız.

        ip ucu: her 4 yılda bir artık yıl vardır (şubat 29 gündür),
        100'ün katı yıllarda artık yıl yoktur ve 400'ün katı yıllarda artık yıl vardır.

        Örnek Ekran Çıktısı
        Bugünün tarihini giriniz: 1 1 2017
        ikinci tarihi giriniz: 1 1 1979
        iki tarih arasında 13894 gün vardır.
         */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dogum yilinizi giriniz");
		int dogumYil=scan.nextInt();
		System.out.println("Lutfen bugunun yilini giriniz");
		int bugunYil=scan.nextInt();
		
		int yasam=bugunYil-dogumYil;
		System.out.println("Yasanilan gun sayisi:"+ yasam*365+ " gundur");
		
		scan.close();

	}

}
