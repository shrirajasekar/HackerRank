package MasterPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  {100,180,40,120,10};
		ArrayList<Integer> out=new ArrayList<Integer>();
		ArrayList<Integer> finalOut=new ArrayList<Integer>();
//		
		int fd = 250;
		int n = arr.length;
//		
		
		int sum=0;
		for(int x=0;x<n;x++){
			for(int y=0;y<=x;y++){
				if(x!=y){
					sum = arr[x]+arr[y];
				}else{
					if(y<arr.length-1){
						y++;
						sum = arr[x]+arr[y];
					}
					
					
				}
				
				if(sum+30 == fd){
					if(!out.contains(x)){
						out.add(x);
						out.add(y);
					}
					
				}
			}
		}
		int [] ref = new int [out.size()];
		for (int k=0;k<out.size();k++){
			ref[k] = arr[out.get(k)];
			System.out.println(out.get(k));
			System.out.println(out.get(k));
			
		}
		int max = ref[0];
		int index = 0;
		for(int i = 1; i < ref.length;i++)
		{
			if(ref[i] > max)
			{
				max = ref[i];
				index = i;
			}
		}
		
		int m1 = out.indexOf(index);
		if(m1%2!=0){
			finalOut.add(out.get(m1-1));
			finalOut.add(out.get(m1));
		}
		
	}

}
