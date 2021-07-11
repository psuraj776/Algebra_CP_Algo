//Binary exponentiation (also known as exponentiation by squaring) is a trick which allows to calculate an using only O(logn) multiplications (instead of O(n) multiplications required by the naive approach).
//Idea is to compute a^8 instead of doing a*a*a.... we can do a^4*a^4->then to compute a^4 we can do a^2*a^2 and then to compute a^2 we can do a*and
/*
if pow=0 result 1.
if pow is even reduce power to half like (a^(pow/2))^2
if pow is odd we can do (a^((pow-1)/2))^2 * a
Since power grows exponentially use long or int accordingly
*/
/*
Reference
https://cp-algorithms.com/algebra/binary-exp.html
*/
import java.util.*;

class BinaryExponentiation {
	public static void main (String[] args) {
		System.out.println(BE(3,14));
	}
	public static int BE(int a,int pow){
	    if(pow==0){
	        return 1;
	    }
	    else if(pow%2==1) return a*BE(a*a,(pow-1)/2);
	    return BE(a*a,pow/2);
	}
}
