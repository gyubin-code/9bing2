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
		// �� �ܰ迡�� 9ĭ���� ���� �� ��, x, y ��ǥ�� ���� ���� �Ǵ� ��� ȣ���� �ݺ����־� �� �̻� ���� ĭ�� ���� ������ �ݺ��ϴ� ���̴�.
		//���� ����ĭ�� �ִ°��
		if(blank) {
			for(int i=x;i<x+N;i++) {
				for(int j=y;j<y+N;j++) {
					arr[i][j]=' ';
				}
			}
			return ;
		}
		
		//���̻� �ɰ���������,
		if(N==1) {
			arr[x][y]='*';
			return;
		}
		/*n=27�϶� ��ϻ�����9
		 * n=9�϶� ��ϻ�����3
		 */
		int size=N/3;
		int count=0;
		for (int i = x; i < x + N; i += size) {
			for (int j = y; j < y + N; j += size) {
				count++;
				if (count == 5) { // ���� ĭ�� ���
					star(i, j, size, true);
				} else {
					star(i, j, size, false);
				}
			}
		}
		
	
	}
}
