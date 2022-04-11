import java.util.Scanner;
public class j_1285 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int cnt=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				cnt++;
			}
		}
		System.out.print(cnt);
	}
}