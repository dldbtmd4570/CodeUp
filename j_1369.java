import java.util.Scanner;
public class j_1369 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int cnt=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++,cnt++) {
				if((i>0 && i<n-1)&&(j>0 && j<n-1)&&(i+j+1)%k!=0)
						System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}