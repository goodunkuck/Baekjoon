import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2566 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�ִ��� ������ ���� ����
		int max = 0;
		//��� �� ��ȣ�� ������ ���� ����
		String xy = "";
		
		//��� ���� �Է°��� �־��� for��
		for(int i = 1; i <= 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= 9; j++) {
				int N = Integer.parseInt(st.nextToken());
				
				if(max < N) {
					max = N;
					xy = String.valueOf(i) + " " + String.valueOf(j);
				}
			}
		}
		System.out.println(max);
		System.out.println(xy);
	}

}
