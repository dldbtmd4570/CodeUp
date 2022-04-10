import java.util.Scanner;
public class j_1284 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int cnt=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				for(int j=1;j<=i;j++)
					if(i%j==0)
						cnt++;
			}
		}
		if(cnt==4) {
			for(int i=2;i<n;i++) {
				if(n%i==0)
					System.out.print(i+" ");
			}
		}
		else
			System.out.print("wrong number");
	}
}