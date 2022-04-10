import java.util.Scanner;
public class j_1288 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=s.nextInt();
		int n_P_r=1;
		for(int i=n;i>1;i--) 
			n_P_r*=i;
		for(int i=n-r;i>1;i--)
			n_P_r/=i;
		for(int i=r;i>1;i--)
			n_P_r/=i;
		System.out.print(n_P_r);
	}
}