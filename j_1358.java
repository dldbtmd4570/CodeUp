import java.util.Scanner;
public class j_1358 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int cnt=0;
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				cnt++;
			}
		}
		for(int i=1;i<=cnt;i++) {
			for(int j=0;j<cnt-i;j++) {
				System.out.printf(" ");
			}
			for(int j=0;j<i*2-1;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}