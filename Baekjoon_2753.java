import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2753 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		//4�� ����� �Ͱ� 100�� ����� �ƴ� ���� �� ������ �� �����Ǿ�� �����̴�.
		//400�� ����� ���� �ռ� �ٸ� ���ǵ��� �������� �ʾƵ� 400�� ����� �����̴�.
		if(N % 4 == 0 && N % 100 != 0 || N % 400 == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
