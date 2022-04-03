import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Baekjoon_1427 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		Integer[] arr = new Integer[S.length()];
		
		for(int i = 0; i < S.length(); i++) {
			arr[i] = S.charAt(i) - '0';
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int k : arr) {
			System.out.print(k);
		}
	}

}
