package java_extra01;

import java.util.Scanner;

public class Soru13 {

	public static void main(String[] args) {
		/*
	    Klavyeden okunacak bir e-mail adresindeki kullanıcı adını ve sunucu adını ekrana 
	    yazdıran bilgisayar programını Java dilinde yazınız.
	    e-mail adresi örneği: alicanq@yhooo
	    ekrana:
	    kullaniciadi: alican
	    sunucu: yhooo
	     */
		Scanner scan=new Scanner(System.in);
		System.out.println("emailinizi giriniz:");
		String mail=scan.next();
		
		int index=mail.indexOf("@");
		int index1=mail.indexOf('.');
		System.out.println("sunucu:"+ mail.substring(index+1,index1));
		System.out.println("kullanici adiniz:"+ mail.substring(0, index));
		

	}

}
