package beakjun;
import java.util.Scanner;

public class compare_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		
		if(a>b) {
			System.out.println(">");
		}
		else if(a<b) {
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}
		
		
		

	}

}
