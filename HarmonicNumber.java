package Day5;

import java.util.Scanner;

public class HarmonicNumber {
public static void main(String[] args) {
		
		float Harmonic = 1;
		System.out.println("Enter the Nth number : :");
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 2; i <= N; i++) {
			Harmonic += (float) 1 / i;
			System.out.println(i+ "th Harmonic is "+Harmonic);

}
}
}