import java.util.Scanner;
public class j_1362 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		for(int i=n;i>0;i--) 
			sum+=i;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(sum-- +" ");
			}
			System.out.println();
		}
	}
}
