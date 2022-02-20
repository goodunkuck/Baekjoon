import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baekjoon_1181 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		List<String> list = new ArrayList<String>();
		
		//입력값을 list에 저장
		for(int i = 0; i < N; i++) {
			list.add(br.readLine());
		}
		//정렬
		Collections.sort(list);
		
		//입력 값의 길이 제한이 50이기 때문에 1~50까지 확인
		for(int i = 1; i <= 50; i++) {
			for(int j = 0; j < list.size();) {
				//해당 인덱스의 값의 길이가 i와 같다면 sb에 저장하고 list에서 해당하는 모든 값을 제거
				if(list.get(j).length() == i) {
					sb.append(list.get(j)).append("\n");
					list.removeAll(Arrays.asList(list.get(j)));
				//제거하면 당연 현재 인덱스에 있는 값도 사라지는데 다음 인덱스로 넘어가면
				//당연하게도 현재 인덱스에 옮겨진 값도 넘어가버리기때문에 지워지지 않았을때마 다음 인덱스로 넘어간다.
				}else {
					j++;
				}
			}
			//list가 비어버리면 반복문을 종료한다,
			if(list.isEmpty()) break;
		}
		System.out.println(sb);
	}

}
