
import java.io.*;
import java.util.*;
import java.lang.*;

public class Baekjoon_11721 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		
		for(int i = 1; i <= (N.length() / 10) + 1; i++) {
			if(i < ((N.length() / 10) + 1)) {
				System.out.println(N.substring(((i-1) * 10), (i * 10)));				
			}else {
				System.out.println(N.substring(((i-1) * 10)));
			}
		}
	}
}