import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1543 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		String S2 = br.readLine();
		int size = S.length();
		int size2 = S2.length();
		int count = 0;
//		for(int i = 0; i < size; i++) {
//			if(S.charAt(i) == S2.charAt(0) && size >= size2) {
//				for(int j = 0; j < size2; j++) {
//					if(S.charAt(i + j) != S.charAt(j)) break;
//					if(j == size2 - 1) {
//						count++;
//						i = 0;
//						S = S.substring((i + j), size - 1);
//						size = S.length();
//					}
//				}
//			}
//		}
		S = S.replace(S2, "");
		System.out.println((size - S.length()) / size2);
	}

}
