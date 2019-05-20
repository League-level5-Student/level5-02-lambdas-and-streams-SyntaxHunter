package _01_Lambda_Methods;

import java.util.Arrays;
import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage(s -> System.out.println(new StringBuilder(s).reverse().toString()), "backwards");
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage(s -> {
			char[] sArray = s.toCharArray();
			StringBuilder str = new StringBuilder();
			for(char c : sArray) {
				if(new Random().nextBoolean())
					str.append(("" + c).toUpperCase());
				else
					str.append(("" + c).toLowerCase());
			}
			System.out.println(str.toString());
		}, "capitalize");
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage(s -> {
			StringBuilder str = new StringBuilder(s);
			int finalLength = str.length() * 2 - 1;
			for(int i = 1; i < finalLength; i += 2) {
				str.insert(i, ".");
			}
			System.out.println(str.toString());
		}, "periods");
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage(s -> {
			StringBuilder str = new StringBuilder(s);
			char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
			// How can I use a stream to complete this?
			// Will the stream apply to vowels or str?
		}, "vowels");
		
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
