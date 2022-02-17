import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1357 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//�Է°��� sb�� �����Ѵ�.
		StringBuilder sb = new StringBuilder(st.nextToken());
		//sb�� ������ ���� �����´�.
		String A = sb.reverse().toString();
		//���� ����
		sb = new StringBuilder(st.nextToken());
		String B = sb.reverse().toString();
		
		//������ ���� ������ ����ȯ�ؼ� �����ش�.
		int sum = Integer.parseInt(A) + Integer.parseInt(B);
		
		//���� ���� sb�� �����Ѵ�.
		sb = new StringBuilder(String.valueOf(sum));
		
		//�����´�.
		String result = sb.reverse().toString();
		
		System.out.println(Integer.parseInt(result));
	}

}
