package MasterPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.lang.model.element.Element;

public class Codelity2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] Ar = {4,6,2,2,6,6,1};
		//int [] Ar = new int [50001];
		//Arrays.fill(Ar, 2);
		int N = Ar.length;
		String Arr = Ar.toString();
		System.out.println(Arr);
		
		/*if(N>=8){
			int split=N/4;
			
			int [] A = Arrays.copyOfRange(Ar, 0, split);    //{4,6,2}
			int [] B = Arrays.copyOfRange(Ar, split, split*2);  //{2,6,6,1}
			int [] C = Arrays.copyOfRange(Ar, split*2, split*3);
			int [] D = Arrays.copyOfRange(Ar, split*3, Ar.length);
		}else if(N>=6){
			int split = N/3;
			int [] A = Arrays.copyOfRange(Ar, 0, split);    
			int [] B = Arrays.copyOfRange(Ar, split, split*2);  
			int [] C = Arrays.copyOfRange(Ar, split*2, Ar.length);
		}else{
			int split = N/2;
			int [] A = Arrays.copyOfRange(Ar, 0, split);    
			int [] B = Arrays.copyOfRange(Ar, split, Ar.length);  
		}
		
		
        int result = 0;
        
        for(int i =0;i<A.length;i++){
        	for (int j=0;j<B.length;j++){
        		if (A[i] == B[j])
                    result = Math.max(result, Math.abs(i - (j+split)));
        	}
        	for (int k=0;k<C.length;k++){
        		if (A[i] == C[k])
                    result = Math.max(result, Math.abs(i - (k+split*2)));
        	}
        	for (int l=0;l<D.length;l++){
        		if (A[i] == D[l])
                    result = Math.max(result, Math.abs(i - (l+split*3)));
        	}
        }
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (Ar[i] == Ar[j])
                    result = Math.max(result, Math.abs(i - j));
        System.out.println(result); 
        System.out.println(N);*/
	}

}
