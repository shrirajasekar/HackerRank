package MasterPackage;

public class Codelity2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {5,4,0,3,1,6,2};
		String [] res = new String [A.length];
		String r = "";
		int temp = 0;
		int max=0;
		for(int i=0;i<A.length;i++){
			temp = i;
			while(temp!=A[temp] && !r.contains(Integer.toString(A[temp]))){
				r = r+A[temp];
				temp = A[temp];
			}if(temp == A[temp]){
				r=r+temp;
			}
			r=r+"_";
		}
		res = r.split("_");
		for(int j=0;j<res.length;j++){
			if(max<res[j].length()){
				max  = res[j].length();
			}
		}
		
		System.out.println(max);
				
	}
	

}
