package Day5;

import java.util.Scanner;

public class PowerOf2 {
	public static boolean isInputValid(int num) {
        return num>=0 && num<=31;
    }
    public static void powerOf2(int num){
        for(int i=0;i<=num;i++) {
            System.out.println("2^"+ i +" = " + Math.pow(2, i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter the value of N: ");
            int n = sc.nextInt();
            if(!isInputValid(n)) {
                System.out.println("Entered number is invalid");
            }
            else{
                powerOf2(n);
                break;
            }
        }


    }
}
