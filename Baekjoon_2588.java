import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2588 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		String S = String.valueOf(B);
		
		for(int i = 2; i >= 0; i--) {
			//1�� �ڸ������� �̾Ƴ��� �����ϴ°��̴�.
			//���� char���� ����ȭ ��Ű�� ���� '0'�� ���ش�.
			System.out.println((S.charAt(i) - '0') * A);
		}
		System.out.println(A * B);
		
	}

}
