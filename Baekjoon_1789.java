import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1789 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long S = Long.parseLong(br.readLine());
		
		//���� ��
		int N = 1;
		while(true) {
			if(S >= N) S -= N;
			//S���� N�� �۴ٸ� �ݺ��� �������ش�.
			else break;
			N++;
		}
		//--N�� ���ִ� ������ N�� --�� ������ ������ ����⿡ N--�� �ϸ� N�� ����ϰ� --�� �Ѵ�.
		//�׷��⿡ ���ְ� ����ϱ� ���� --�� �տ� ����.
		System.out.println(--N);
	}

}
