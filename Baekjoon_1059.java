import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1059 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		//n������ ū ������ ���� ���� ���� ���� �� ����
		int high = 1000;
		//n������ ���� ������ ���� ū ���� ���� �� ����
		int low = 0;
		//n�� num�� ������ �Ǵ� �� ����
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < L; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			//n�� num�� ���ٸ� count�� 1�� ���ϰ� �ݺ��� ����
			if(num == n) {
				count++;
				break;
			}
			
			//n ���� ���� ����� ������ ���� ���� ��
			if(num < n && low < num) low = num;

			if(num > n && high > num) high = num;
		}
		//������ ������ ���� �� ����
		int result = 0;
		//count�� 1�̸� n�� num�� ���ٴ� ���̴� 0 ���
		if(count == 1) {
			System.out.println(0);
		}else {
			//Ǯ�� ������� ���� ���� ������ ���ϴ� �ݺ���
			for(int i = (low + 1); i <= n; i++) {
				for(int j = n; j < high; j++) {
					result++;
				}
			}
			//[n,n]�� �ֱ⶧���� -1�ؼ� ���
			System.out.println((result - 1));
		}
	}

}
