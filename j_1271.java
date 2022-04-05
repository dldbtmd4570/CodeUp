import java.util.Scanner;
public class j_1271 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int max=0;
		int a;
		for(int i=0;i<n;i++) {
			a=s.nextInt();
			if(max<a)
				max=a;
		}
		System.out.println(max);
	}
}