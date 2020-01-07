package MasterPackage;

import java.util.Arrays;

public class Codelity2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,count=0;
		int[] res = new int[b-a]; 
		int j=0;
		for(int i=b;i>=a;i--){
			if(isSquareNum(i)){
				double temp =i;
				while(isSquareNum(temp)&&temp>2){
					temp =   Math.sqrt(temp);
					count++;					
				}
				res[j]=count;
				j++;
				count=0;
			}
		}
		Arrays.sort(res);
		System.out.println(res[res.length-1]);
		
	}
	
	public static boolean isSquareNum(double x)  
    { 
        double s = Math.sqrt(x); 
        return ((s - Math.floor(s)) == 0); 
    } 
      

}
