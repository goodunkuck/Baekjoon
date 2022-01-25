import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_4299 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		//¦�� ���δ� (¦������ �ñ��� ��) % 2 == 0�� �ϸ� �ȴ�.
		//�׸��� �翬�Ѱ����� �� ���� ���� ������ Ŀ���ϴϱ� A�� B���� ������ �ȵȴٴ� ���ǵ� �־��ش�.
		if((A + B) % 2 != 0 || A < B) {
			System.out.println(-1);
		}else {
			//�� ���� ������ �ΰ� ����϶� ������ �� ���̿� ������ �־��ش�.
			System.out.println(((A + B) / 2) + " " + (((A + B) / 2) - B));
		}
	}

}