import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_5532 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�������� ��޵� ������ �� ��������. �迭�� �ϰ���� �迭�� �ص� �ȴ�.
		int L = Integer.parseInt(br.readLine());
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		//����� ���� ������ �� Ǫ�µ� �ɸ��� �ִ� �ϼ��� ���ϱ� ���� ������ �����Ѵ�.
		int count = 0;
		
		//������ Ǫ�µ� �ݺ� Ƚ�� ������ �� �� ������ ���� ������ ������ �� Ǯ������ �ݺ����� Ż���Ѵ�.
		while(true) {
			if(A <= 0 && B <= 0) {
				break;
			}
			A -= C;
			B -= D;
			count++;
		}
		//�ִ� �ϼ�(count)�� �������� �װ� ���� �Ⱓ���� �A��.
		System.out.println(L - count);
		
	}

}
