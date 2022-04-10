import java.util.Scanner;
public class j_1282 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int t=(int)Math.sqrt(n);
		System.out.print(n-(int)Math.pow(t, 2)+" "+t);
	}
}