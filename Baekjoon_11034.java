import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11034 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S;
		
		//null �� ó��
		while((S = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(S);
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			//A���� B, B���� C������ �� �Ÿ��� �� ū ���� ���Ѵ�.
			int max = Math.max((B - A), (C - B));
			
			System.out.println(max);
		}
	}

}
