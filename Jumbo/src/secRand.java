import java.security.SecureRandom;
import java.util.Random;
public class secRand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom sr = new SecureRandom();
		Random ran = new Random();
		
		
		for(int i =0 ; i<15;i++){
		
		
		System.out.println("SR -- "+sr.nextInt());
		
		System.out.println(ran.nextInt());
		
		}
	}

}
