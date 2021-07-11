//Time O(log(n))
/*
(F0,F1)*[(0 1)  =  (Fn,Fn+1)
        (1 1)]^n
*/
/*
Reference
https://cp-algorithms.com/algebra/fibonacci-numbers.html
*/

import java.util.*;

class FibonacciUsingBinaryExponantiation {
	public static void main (String[] args) {
	    int F0=0;
	    int F2=1;
	    int F3=1;
	    //3 are already given so we'll start from 4
	    //if we have to get 5th fibonacci we'll pass 5-3 as power
	    Long[][] P = {{0L,1L},{1L,1L}};
    	Long[][] resP = GetNthFibo(P,56-3); //we'll get 55th fibonacci number
    	Long Fi=resP[1][0]+resP[1][1];
    	System.out.println(Fi);
	}
	public static Long[][] GetNthFibo(Long[][] P,int pow){
	    if(pow<=1) return P;
	    else if(pow%2==1) return matrixMulti(P,GetNthFibo(matrixMulti(P,P),(pow-1)/2));
	    return GetNthFibo(matrixMulti(P,P),pow/2);
	}
	public static Long[][] matrixMulti(Long[][] P1,Long[][] P2){
	    Long[][] resMatrix = new Long[2][2];
	    resMatrix[0][0]=P1[0][0]*P2[0][0]+P1[0][1]*P2[1][0];
	    resMatrix[0][1]=P1[0][0]*P2[0][1]+P1[0][1]*P2[1][1];
	    resMatrix[1][0]=P1[1][0]*P2[0][0]+P1[1][1]*P2[1][0];
	    resMatrix[1][1]=P1[1][0]*P2[0][1]+P1[1][1]*P2[1][1];
	    return resMatrix;
	}
}
