package Day5;

import java.util.Scanner;

public class VowelOrConsonant {
	
	public class VowelsConsonants {
		
		public static void main(String[] args) {
			
			System.out.println("Enter a letter : ");
	        Scanner sc = new Scanner(System.in);
	        char Letter = sc.next().charAt(0);

	        if(Letter  == 'a' || Letter  == 'e' || Letter  == 'i' || Letter  == 'o' || Letter  == 'u')
	            System.out.println(Letter+" is vowel");

	        else
	            System.out.println(Letter+" is Consonant");
		}
	}
}
