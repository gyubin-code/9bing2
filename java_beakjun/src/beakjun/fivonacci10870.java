package beakjun;
import java.util.Scanner;

public class fivonacci10870 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		int sum=fivonacci(n);
		System.out.println(sum);
	}
	public static int fivonacci(int x) {
		//�Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�,
		//1��° �Ǻ���ġ ���� 1�̴�. �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
		if(x==0) return 0;
		else if(x==1) return 1;
		else if(x==2) return 1;
		else return fivonacci(x-1)+fivonacci(x-2);
		
	}
}
