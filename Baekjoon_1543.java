import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1543 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		String S2 = br.readLine();
		//�̸� ó���� S ���ڿ��� ���̸� ����ش�.
		int size = S.length();
		int size2 = S2.length();
		
		//S2�� �����ش�.
		S = S.replace(S2, "");
		System.out.println((size - S.length()) / size2);
	}

}
