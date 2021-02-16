package beakjun;
import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
        in.close();
        int sum=fac_fun(n);
		System.out.println(sum);
	}
	public static int fac_fun(int x) {
		if(x<=1) return 1;
		else  return x*fac_fun(x-1);
	}
	
}

