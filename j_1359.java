import java.util.Scanner;
public class j_1359 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(); 
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}
}
