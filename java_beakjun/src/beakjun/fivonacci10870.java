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
		//피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고,
		//1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
		if(x==0) return 0;
		else if(x==1) return 1;
		else if(x==2) return 1;
		else return fivonacci(x-1)+fivonacci(x-2);
		
	}
}
