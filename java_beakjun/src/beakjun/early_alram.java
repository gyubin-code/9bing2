package beakjun;
import java.util.Scanner;
public class early_alram {
	public static void main(String[] args) {
		int a,b;
		Scanner in =new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		in.close();
		if(a==0) {
			a=24;
			if(b>=45) {
				b=b-45;
				System.out.println(a+" "+b);
			}
			else {
				//under 45min
				a=a-1;
				b=b+15;
				System.out.println(a+" "+b);
			}
		}
			else if(a!=0) {
				if(b>=45) {
					b=b-45;
					System.out.println(a+" "+b);
				}
				else {
					//under 45min
					a=a-1;
					b=b+15;
					System.out.println(a+" "+b);
				}
			}
	}
	
}
