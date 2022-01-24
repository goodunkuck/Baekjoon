import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_5596 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int S = 0;
		int T = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i = 0; i < 4; i ++) {
			S += Integer.parseInt(st.nextToken());
			T += Integer.parseInt(st2.nextToken());
		}
		if(S >= T) {
			System.out.println(S);
		}else {
			System.out.println(T);
		}
	}

}
