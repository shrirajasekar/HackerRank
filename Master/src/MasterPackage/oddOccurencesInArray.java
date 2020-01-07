package MasterPackage;

public class oddOccurencesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []  A = {9,3,9,3,9,7,9};
		String Ar = "";
		for(int i=0;i<A.length;i++){
			Ar = Ar+A[i];
		}
		String ref = "";
		for(int i=0;i<Ar.length();i++){
			for(int j=0;j<Ar.length();j++){
				if(Ar.charAt(i)==Ar.charAt(j) && i!=j){
					Ar=Ar.replace(Character.toString(Ar.charAt(i)), "");
					
				}
			}
		}
		System.out.println(Ar);
	}

}
