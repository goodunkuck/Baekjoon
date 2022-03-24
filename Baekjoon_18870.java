import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baekjoon_18870 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//처음에 입력받은 순서를 알기위한 배열
		int[] input = new int[N];
		//정렬하기위한 배열
		int[] Array = new int[N];
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			input[i] = num;
			Array[i] = num;
		}
		
		//정렬
		Arrays.sort(Array);
		
		//첫번째값을 우선 저장한다.
		hash.put(Array[0], 0);
		//순서 변수
		int rank = 1;
		//인덱스 변수
		int index = 1;
		//인덱스가 N보다 작을때 반복한다.
		while(index < N) {
			//정렬했기 때문에 앞 뒤 값이 중복이 아닐때
			if(Array[index] != Array[index - 1]) {
				hash.put(Array[index], rank);
				rank++;
			}
			//중복이면 순서는 그대로, 인덱스만 +1을 해준다.
			index++;
		}
		
		for(int i = 0; i < N; i++) {
			sb.append(hash.get(input[i])).append(" ");
		}
		System.out.println(sb);
	}

}
