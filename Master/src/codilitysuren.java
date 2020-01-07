import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class codilitysuren {

	/**
	 * @param args
	 * @return 
	 */
	public static  String checkExist(ArrayList<String> emailList,String em){
		
		String r="N";
		for(String i:emailList){
			if(i.trim().equals(em.trim())){
				r="Y";
			}
		}
		return r;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "John Doe; Peter Parker; Mary Jane Watson-Parker; James Doe; John Elvis Doe; Jane Doe; Penny Parker";
		S = S.toLowerCase();
		String com = "example";
		com= com.toLowerCase();
		String lname = "";
		String fname = "";
		String email = "";
		int count = 2;
		String result = "";
		ArrayList<String> emailList=new ArrayList<String>();
		ArrayList<String> refList=new ArrayList<String>();
//		Set<String> ref = new HashSet<String>();
		
//		System.out.println(S);
		for(String name : S.split(";")){
			if(name.charAt(0)==' '){
				name = name.trim();
				name=name.replace("-","");
				fname = name.split(" ")[0];	
				lname = " "+name.split(" ")[name.split(" ").length-1];
			}else{
			name = name.trim();
			name=name.replace("-","");
			fname = name.split(" ")[0];	
			lname = name.split(" ")[name.split(" ").length-1];
			}
			email = lname+fname.charAt(0)+"@"+com+".com";
			if(checkExist(emailList,email).equals("Y")){
				if(!refList.contains(email.trim())){
					refList.add(email.trim());
					count=2;
				}
			
				email = email.substring(0,email.indexOf('@'))+Integer.toString(count++)+email.substring(email.indexOf('@'));
				
				
			}
			emailList.add(email);	
			
		}
		for(String  e : emailList){
			System.out.println(e);
			result= result+e+";";
//			System.out.println(result);
		}
		result= result.substring(0,result.length()-1);
		System.out.println(result);
		
		
		
	}	
	
	
	
}

