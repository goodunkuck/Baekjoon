import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1526 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		
		//-1�� ����� �ؾ����� �𸣱⶧���� ���ѷ����� �ݺ�
		while(true) {
			//4�� 7�θ� �̷���� ������ �Ǵ��ϱ����� ����
			boolean check = true;
			//�ش� �ε����� 4�� 7 �Ѵ� �ƴϸ� check�� false�� �����ϰ� �ݺ��� ����
			for(int i = 0; i < N.length(); i++) {
				if(N.charAt(i) != '4' && N.charAt(i) != '7') {
					check = false;
					break;
				}
			}
			//�ش� ���� 4�� 7�̶�� check�� true�� ���̰�, true��� �ݺ��� ����
			//false��� �ش� ���� -1�� ���ش�. �Է¹����� String�̱� ������ ����ȯ�� ���༭ ���ְ�, �ٽ� ����ȯ
			if(check == true) break;
			else N = String.valueOf(Integer.parseInt(N) - 1);
		}
		System.out.println(N);
	}

}
