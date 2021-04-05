package java_extra01;

import java.util.Scanner;

public class Soru07 {

	public static void main(String[] args) {
		  /* Problem Tanımı
        Kullanıcıdan bugünün’ün tarihini ve kaç yaşında olduğunu alarak
        doğum tarihini yıl olarak bulan kod yazınız.

        */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bugunun tarihini yil olarak giriniz:");
		int bugun=scan.nextInt();
		System.out.println("Lutfen kac yasinda oldugunuzu giriniz");
		int yas=scan.nextInt();
		
		int dogumTarihi=bugun-yas;
		System.out.println("Dogum tarihiniz:"+ dogumTarihi);
		

	}

}
