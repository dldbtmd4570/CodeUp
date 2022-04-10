import java.util.Scanner;
public class j_1286 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int max,min,n;
		n=s.nextInt();
		max=min=n;
		for(int i=0;i<4;i++) {
			n=s.nextInt();
			if(max<n)
				max=n;
			if(min>n)
				min=n;
		}
		System.out.println(max);
		System.out.println(min);
	}
}