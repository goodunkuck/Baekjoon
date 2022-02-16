import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1259 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//���ѷ���
		while(true) {
			String S = br.readLine();
			//StringBuilder�� �����ϸ鼭 �Է°��� S�� �����Ѵ�.
			StringBuilder sb = new StringBuilder(S);
			//StringBuilder ���� �Լ� reverse�� ��������� ������ ���� StringBuilder�� ���尡���ϱ⿡
			//String���� ��ȯ�ؼ� �����Ѵ�. �װ��� �ڿ� .toString()�̴�.
			String Sreverse = sb.reverse().toString();
			
			//0 �Է½� ���ѷ��� ����
			if(S.equals("0")) break;
			
			//�� ���ڿ��� ��
			if(S.equals(Sreverse)) {
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
	}

}
