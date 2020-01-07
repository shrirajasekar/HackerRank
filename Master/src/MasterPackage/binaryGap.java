package MasterPackage;

public class binaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int in = 32;
		StringBuilder bin = new StringBuilder();        
		while(in!=0){
			bin.append(in%2);
			in = in/2;
		}
			bin = bin.reverse();
			System.out.println(bin);
			int [] ref = new int [bin.length()];
			int x=0;
			for(int j=0;j<bin.length();j++){
				if(bin.charAt(j)=='1'){
					ref[x] = j;
					//System.out.println(ref[x]);
					x++;
				}
			}
			int max =0;
			for(int y=0;y<ref.length;y++){
				if(y+1<ref.length){
					if(max<(ref[y+1]-ref[y])){
						max = ref[y+1]-ref[y];
					}
				}
				
			}
			if(max>0){
				max--;
			}
			System.out.println(max);

	}

}
