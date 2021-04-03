package Java_Extra;

import java.util.Scanner;

public class Soru10 {

	public static void main(String[] args) {
		/*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen ucgenin dik birinci kenarini giriniz:");
		double k1=scan.nextDouble();
		System.out.println("Lutfen ucgenin dik ikinci kenarini giriniz:");
		double k2=scan.nextDouble();
		
		double h=Math.sqrt((k1*k1)+(k2*k2));
		System.out.println("Hipotenus:"+ h);

		scan.close();
	}

}
