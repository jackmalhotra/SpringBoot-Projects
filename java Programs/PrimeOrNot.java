package ttsttsts;

import java.util.*;

public class PrimeOrNot {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Number greater thar 2 : ");
	    int num =sc.nextInt();
	    
	    int divisor = 2;
        while (divisor <= num / 2) {
            if (num % divisor == 0) {
                System.out.println(num + " is not a prime number.");
                return;
            }
            divisor++;
        }
        
        System.out.println(num + " is a prime number.");
	}


}