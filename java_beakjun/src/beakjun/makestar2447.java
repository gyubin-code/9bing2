package beakjun;
import java.util.Scanner;

public class makestar2447 {
	static char[][] arr;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		arr=new char[n][n];
		star(0,0,n,false);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
		
	}
	public static void star(int x,int y,int N,boolean blank) {
		// 각 단계에서 9칸으로 구분 한 뒤, x, y 좌표에 따라서 공백 또는 재귀 호출을 반복해주어 더 이상 나눌 칸이 없을 때까지 반복하는 것이다.
		//만약 공백칸이 있는경우
		if(blank) {
			for(int i=x;i<x+N;i++) {
				for(int j=y;j<y+N;j++) {
					arr[i][j]=' ';
				}
			}
			return ;
		}
		
		//더이상 쪼갤수없을때,
		if(N==1) {
			arr[x][y]='*';
			return;
		}
		/*n=27일때 블록사이즈9
		 * n=9일때 블록사이즈3
		 */
		int size=N/3;
		int count=0;
		for (int i = x; i < x + N; i += size) {
			for (int j = y; j < y + N; j += size) {
				count++;
				if (count == 5) { // 공백 칸일 경우
					star(i, j, size, true);
				} else {
					star(i, j, size, false);
				}
			}
		}
		
	
	}
}
