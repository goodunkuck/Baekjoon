import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_6609 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
        
		//�Է°��� null�� �ƴϸ� �ݺ��ϴ� �ݺ���
		while((s = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			int M = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			int R = Integer.parseInt(st.nextToken());
			int S = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			//M���� �����⿡�� �Ѿ���� ���� ���� �Ǹ� ������ M���� �������� ������ ������ �ϳ� ����� �������ش�.
			for(int i = 0; i < N; i++) {
				int m = M;
				M = P / S;
				P = L / R;
				L = m * E;
			}
			System.out.println(M);
		}
	}

}
