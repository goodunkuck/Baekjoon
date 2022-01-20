import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_5522 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		
		for(int i = 1; i < 6; i++) {
			int A = Integer.parseInt(br.readLine());
			if(0 <= A && A <= 100) {
				sum += A;
			}
		}
		System.out.println(sum);
	}
	
}