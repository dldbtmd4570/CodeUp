import java.util.Scanner;
public class j_1269 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int n=s.nextInt();
		int total=0;
		for(int i=0;i<n-1;i++){
			a=a*(b)+c;
		}
		System.out.print(a);
	}
}