import java.util.Scanner;
public class j_1370 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int h=s.nextInt();
		int r=s.nextInt();
		for(int k=0;k<r;k++) {
			for(int i=0;i<h;i++) {
				for(int j=0;j<i;j++)
					System.out.print(" ");
				System.out.println("*");
			}
			for(int i=h;i>1;i--) {
				for(int j=1;j<i-1;j++)
					System.out.print(" ");
				System.out.println("*");
			}
		}
	}
}
