import java.util.Scanner;
public class j_1278 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		while(n>0) {
			n/=10;
			count++;
		}
		System.out.print(count);
	}
}