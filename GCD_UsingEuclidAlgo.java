//Idea is GCD(a,b)=GCD(b,a%b)
//Time O(log(min(a,b)))
/*
Reference
https://cp-algorithms.com/algebra/euclid-algorithm.html
*/

import java.util.*;

class GCD_UsingEuclidAlgo {
	public static void main (String[] args) {
		System.out.println(GCD(15,40));
	}
	public static int GCD(int a,int b){
	    if(a==0) return b;
	    if(b==0) return a;
	    return GCD(b,a%b);
	}
}
