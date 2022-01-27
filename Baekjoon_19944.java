import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_19944 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		//1,2 학년은 뉴비 / 3학년부터 M학년까지 올드비 / 나머지 틀
		if(M < 3) {
			System.out.println("NEWBIE!");
		}else if(3 <= M && M <= N) {
			System.out.println("OLDBIE!");
		}else {
			System.out.println("TLE!");
		}
	}

}
