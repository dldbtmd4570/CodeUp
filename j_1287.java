import java.util.Scanner;
public class j_1287 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<10;i++) {
			for(int j=0;j<n*i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}