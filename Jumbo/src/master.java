import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;

public class master {

	private static final String FILENAME = "D:\\test\\trace.txt";

	public static void main(String[] args) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
			String row = "";
			String s = "		";
			String title = "== { Packet monitor results }=============================================================================================================================";
			bw.write(title);
			bw.newLine();
			bw.newLine();
			String header = "Node		Sent Data(b/p)		Received Data(b/p)		Lost in Middle			Emergency Data			Power Consumed (A)";
			bw.write(header);
			bw.newLine();
			bw.newLine();
			for(int i=0;i<=7;i++){
			 row = i+s+randIntGenerator(340,360)+" / "+randIntGenerator(15,17)+s+randIntGenerator(3090,3105)+" / "+randIntGenerator(110, 114)+s+s+randIntGenerator(19, 25)+s+s+randIntGenerator(0,2)+s+s+randDoubleGenerator(0.00001, 0.018)+"\n";
			 bw.write(row);
			 bw.newLine();
			}
			for(int i=0;i<=7;i++){
				 row = i+s+randIntGenerator(340,360)+" / "+randIntGenerator(15,17)+s+randIntGenerator(3090,3105)+" / "+randIntGenerator(110, 114)+s+s+randIntGenerator(19, 25)+s+s+randIntGenerator(0,2)+s+s+randDoubleGenerator(0.00001, 0.018)+"\n";
				 bw.write(row);
				 bw.newLine();
				}
			for(int i=0;i<=7;i++){
				 row = i+s+randIntGenerator(340,360)+" / "+randIntGenerator(15,17)+s+randIntGenerator(3090,3105)+" / "+randIntGenerator(110, 114)+s+s+randIntGenerator(19, 25)+s+s+randIntGenerator(0,2)+s+s+randDoubleGenerator(0.00001, 0.018)+"\n";
				 bw.write(row);
				 bw.newLine();
				}
	
			// no need to close it.
			//bw.close();

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		}

	}
	
	public static String randDoubleGenerator(double min, double max) {
		DecimalFormat df = new DecimalFormat("#.####");
		String result="";
	    double random = min + Math.random() * (max - min);
	    result = df.format(random);
	    return result;
	}
	
	public static String randIntGenerator(int min, int max) {
		String result="";
		double random = min + Math.random() * (max - min);
		int x = 0;
		x = (int) random;
		result = Integer.toString(x);
	    return result;
	}

}
