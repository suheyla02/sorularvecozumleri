package Java_Extra;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		// Write a Java program to convert temperature from Fahrenheit to Celsius degree.

		// formula
		    // (32°F − 32) × 5/9 = 0°C
		    // c = (f-32)*5/9

		//scanner kullanin

		    

		        int fahrenheit = 10;
		        System.out.println((fahrenheit - 32) * 5 / 9);

		        Scanner scan = new Scanner(System.in);
		        System.out.println("Lutfen fahrenheit bir derece giriniz");
		        int fahrenheit1 = scan.nextInt();
		        System.out.println((fahrenheit1 - 32) * 5 / 9);
		    
     scan.close();
	}

}
