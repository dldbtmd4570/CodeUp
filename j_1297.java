import java.util.Scanner;
public class j_1297 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int cnt=0,max=1;
		for(int i=1;i<=n/3;i++) {
			if(max<i*(n-i*2)) {
				max=i*(n-i*2);
				cnt=i;
			}
		}
		System.out.print(cnt);
	}
}