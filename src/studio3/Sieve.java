package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner in= new Scanner(System.in);
		//Prompts user
		System.out.println("Enter n?");
		int n= in.nextInt();
		//creating array and setting length
		boolean[] sieve = new boolean[n+1];
	    // stores array values
			for (int i=2;i<sieve.length;i++) {
				if (sieve [i]==false) {
					for(int j=2*i;j<sieve.length;j+=i) {
					sieve[j]=true;
					//System.out.println(sieve[j]);
				}
			}
			
		}
			int k=2;
			while(k<sieve.length) {
				if (!sieve[k]) {
					System.out.println(k);
				}
				k++;
			}
			
	}

}
