import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10162 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		//T�� 10�� ����� �ƴ϶�� -1�� ���
		if(T % 10 != 0) {
			System.out.println(-1);
		}else {
			//A�� 5������ ����� �����ؾ��ϴ��� ���� ����
			int A = T / 300;
			//5������ ������ ������ �����ϰ� ���� ���� T�� ����
			T %= 300;
			//B�� 1������ ����� �����ؾ��ϴ��� ���� ����
			int B = T / 60;
			//1������ ������ ������ �����ϰ� ���� ���� T�� ����
			T %= 60;
			//10�ʴ� 10�� �����ָ� ������ ���̱⿡ �׳� ��¿��� �ٷ� ����
			System.out.println(A + " " + B + " " + (B / 10));
		}
	}

}
