package java_extra02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		 /*
	     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
	     0-1-1-2-3-5-8-13-21-34....
	     */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int sayi=scan.nextInt();
		
		List<Integer> fibo=new ArrayList<>();
		fibo.add(0);
		fibo.add(1);
		
		for(int i=0;i<sayi-2;i++) {
			fibo.add(fibo.get(i)+fibo.get(i+1));
		}

		for(Integer each:fibo) {
			System.out.print(each+" ");
		}
		
		scan.close();
	}

}
