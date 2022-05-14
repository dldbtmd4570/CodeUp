import java.util.Scanner;
public class j_1368 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int h=s.nextInt();
		int k=s.nextInt();
		char d=s.next().charAt(0);
		for(int i=0;i<h;i++) {
			if(d=='L') {
				for(int j=0;j<i;j++)
					System.out.print(" ");
			}
			else {
				for(int j=i;j<h-1;j++)
					System.out.print(" ");
			}
			for(int j=0;j<k;j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
