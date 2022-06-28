package Day5;

import java.util.Scanner;

public class Factors {
	
	public static void main(String[] args) {
		
		 System.out.println("Enter The Nth Number :: ");
	      Scanner sc = new Scanner(System.in);
	        long n = sc.nextInt();
	        for (long i = 2; i*i <= n; i ++) {

	            while (n % i == 0) {
	                System.out.print(i + " ");
	                n /= i;
	            }
	        }
	        if (n > 1)
	            System.out.println(n);
	}

}
