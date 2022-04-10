import java.util.Scanner;
public class j_1289 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,max=1;
		for(int i=0;i<3;i++) {
			a=s.nextInt();
			b=s.nextInt();
			if(a*b>max) {
				max=a*b;
			}
		}
		System.out.print(max);
	}
}
