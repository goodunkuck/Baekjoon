import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_5596 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int S = 0;
		int T = 0;
		//�� ������ �Է°��� ����
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		//������ �Է°��� ���� �������� ù°���� S�� �ջ� ���� ���� T�� �ջ�
		for(int i = 0; i < 4; i ++) {
			S += Integer.parseInt(st.nextToken());
			T += Integer.parseInt(st2.nextToken());
		}
		//���� ū ���� ����ϴµ� ���� ��� S�� ����Ѵ� ������ S�� T���� ũ�ų� �������� ������
		if(S >= T) {
			System.out.println(S);
		}else {
			System.out.println(T);
		}
	}

}
