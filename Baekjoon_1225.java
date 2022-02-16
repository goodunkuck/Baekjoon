import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1225 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String A = st.nextToken();
		String B = st.nextToken();
		//���ؼ� ���� ���� ������ ������ ����.(long)
		long result = 0;
		
		//�� �Է°��� ���ڿ� ���̸�ŭ �ݺ��ϴ� �ݺ����ȿ��� �������ش�.
		for(int i = 0; i < A.length(); i++) {
			for(int j = 0; j < B.length(); j++) {
				result += (A.charAt(i) - '0') * (B.charAt(j) - '0');
			}
		}
		System.out.println(result);
	}

}
