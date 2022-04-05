import java.util.Scanner;
public class j_1266 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		int a;
		for(int i=0;i<n;i++) {
			a=s.nextInt();
			sum+=a;
		}
		System.out.print(sum);
	}
}