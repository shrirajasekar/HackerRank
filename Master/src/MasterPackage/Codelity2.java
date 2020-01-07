package MasterPackage;

public class Codelity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "my.song.....mp3 0b\ngreatSong.flac 1000000000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b";
		//System.out.println(input);
		
		String [] musicExts = {"mp3","aac","flac"};
		String [] imageExts = {"jpg","bmp","gif"};
		String [] movieExts = {"mp4","avi","mkv"};
		int musicSize =0;
		int imageSize =0;
		int movieSize =0;
		int otherSize =0;
		String res = "";
//		String [] otherExts = {""};
		/*for(int i=0;i<3;i++){
			System.out.println(musicExts[i]);
		}*/
		
		String [] inputArray = input.split("\n");
		String [] elements = new String[2];	
		String filename = "";
		String size = "";
		int s = 0;
		String ext = "";
		
		for(int i=0;i<inputArray.length;i++){
			elements = inputArray[i].split(" ");
			filename = elements[0];
			size = elements[1];
			String [] filenameParts = filename.split("\\.");			
			ext = filenameParts[filenameParts.length-1];
			s = Integer.parseInt(size.substring(0,size.length()-1));
			if(contains(musicExts, ext)){
				musicSize = musicSize+s;
			}else if(contains(imageExts, ext)){
				imageSize = imageSize + s;
			}else if(contains(movieExts, ext)){
				movieSize = movieSize + s;
			}else {
				otherSize = otherSize + s;
			}
			
		}
		res = "music "+musicSize+"b"+"\n"+"images "+imageSize+"b"+"\n"+"movies "+movieSize+"b"+"\n"+"other "+otherSize+"b";
		System.out.println(res);
		//return res;
	}
	
	public static boolean contains(String[] A, String in) {
	    for (String s: A) {
	        if (s.equals(in)){
	            return true;
	        }
	    }
	    return false;
	}
	

}
