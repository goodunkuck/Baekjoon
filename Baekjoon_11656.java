import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_11656 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int size = S.length();
		String[] arr = new String[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = S.substring(i, size);
		}
		
		Arrays.sort(arr);
		
		for(String s : arr) {
			System.out.println(s);
		}
	}

}
