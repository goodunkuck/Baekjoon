import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_3003 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < 6; i++) {
			int N = Integer.parseInt(st.nextToken());
			if(i < 2) {
				if(N == 1) {
					System.out.print(0 + " ");
				}else {
					System.out.print((1 - N) + " ");
				}
			}else if(i < 5) {
				if(N == 2) {
					System.out.print(0 + " ");
				}else {
					System.out.print((2 - N) + " ");
				}
			}else {
				if(N == 8) {
					System.out.print(0 + " ");
				}else {
					System.out.print((8 - N) + " ");
				}
			}
		}
	}

}
