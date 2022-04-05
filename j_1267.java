import java.util.Scanner;
public class j_1267 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a,sum=0;
		for(int i=0;i<n;i++) {
			a=s.nextInt();
			if(a%5==0)
				sum+=a;
		}
		System.out.print(sum);
	}
}