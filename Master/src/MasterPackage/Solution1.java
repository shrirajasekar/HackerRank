package MasterPackage;

import java.util.Arrays;
import java.util.Collections;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//int A[] ={1, 3, 6, 4, 1, 2};
		//int A[] = {1, 2, 3};
		//int A[] = {-1,-5,-9,-3,-4,-6};
		int A[] = {3};
 		int x = solution(A);
		System.out.println(x);
	}

	public static int solution(int[] A) {
		int[] temp = A;
		int[] pos = new int[A.length];
		int c=0;
		int res = 0;
		Arrays.sort(temp);			//-7,-2,0,2,3,6,7,8
		for(int i=0;i<A.length;i++){
			if(i+1 < A.length){
				if(A[i]+1 != A[i+1] && A[i] != A[i+1] && A[i]>0){
					pos[c]=i;
					c++;
				}
			}
		}
		
		
		if(pos[0]==0){
			res = A[A.length-1]+1;
		}else{
			res = A[pos[0]]+1;
		}
		if(res <=0){
			res = 1;
		}
		//System.out.println(res);
		return res;
	        // write your code in Java SE 8
	    }
	
}
