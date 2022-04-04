import java.util.Scanner;
public class j_1230 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>170 && b>170 && c>170)
			System.out.print("PASS ");
		else {
			System.out.print("CRASH ");
			if(a<=170)
				System.out.print(a);
			else if(b<=170)
				System.out.print(b);
			else
				System.out.print(c);
		}
	}
}