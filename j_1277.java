import java.util.Scanner;
public class j_1277 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a,index=1;
		for(int i=0;i<n;i++,index++) {
			a=s.nextInt();
			if(index==1)
				System.out.print(a+" ");
			if(index==n/2+1)
				System.out.print(a+" ");
			if(index==n)
				System.out.print(a+" ");
		}
	}
}