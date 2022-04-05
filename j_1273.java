import java.util.Scanner;
public class j_1273 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<n+1;i++)
			if(n%i==0)
				System.out.print(i+" ");
	}
}