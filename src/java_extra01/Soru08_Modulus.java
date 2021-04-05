package java_extra01;

public class Soru08_Modulus {

	public static void main(String[] args) {
		 // Write a Java program to break an integer into a sequence of individual digits.
		// Hint: use / and %
		// ex: input: 12345
//		    output: 1
//		            2
//		            3
//		            4
//		            5stub
		
		int sayi=12345;
		int birler=sayi%10;
		int onlar=(sayi/10)%10;
		int yuzler=(sayi/100)%10;
		int binler=(sayi/1000)%10;
		int onbinler=(sayi/10000)%10;
	
		System.out.println(onbinler+"\n"+binler+"\n"+yuzler +"\n"+ onlar+"\n"+birler);
		System.out.println("===================");
		// Different Solution:
        int input1 = 12345;
        String sayi1 = input1 + "";
        String t[] = sayi1.split("");
        
        for (String each: t) {
            System.out.println(Integer.parseInt(each));
        }
		
		

	}

}
