import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_11282 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//�Էµ� ���� �ƽ�Ű�ڵ� ���� ���߱� ���� 44031�� ���Ѵ�.
		N += 44031;
		//�ѱ۷� ����ϱ� ���� char������ �� ��ȯ
		char C = (char) N;
		
		System.out.println(C);
	}

}
