//To get prime number less than given number
//O(n log log n)
/*
Reference
https://cp-algorithms.com/algebra/sieve-of-eratosthenes.html
*/

import java.util.*;

class SeiveToGetPrimeNumber {
	public static void main (String[] args) {
		boolean[] is_Prime=new boolean[101]; //index represent a number true means this number is prime here we are going till 101 but you can go to any number
		is_Prime[0]=is_Prime[1]=false;
		for(int i=2;i<101;i++){
		    if(isPrime(i)){
		        is_Prime[i]=true;
		        for(int j=i*i;j*j<101;j+=i){
		            is_Prime[j]=false;
		        }
		    }
		}
		for(int i=0;i<101;i++){
		    System.out.println(is_Prime[i]);
		}
	}
	public static boolean isPrime(int n){
	    for(int i=2;i*i<=n;i++){
	        if(n%i==0) return false;
	    }
	    return true;
	}
}
