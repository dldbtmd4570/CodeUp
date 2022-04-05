import java.util.Scanner;
public class j_1276 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int factorial=1;
		while(n>0) {
			factorial*=n;
			n--;
		}
		System.out.print(factorial);
	}
}