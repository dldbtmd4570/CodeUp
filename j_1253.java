import java.util.Scanner;
public class j_1253 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int t;
		if(a>b){
			t=b;
			b=a;
			a=t;
		}
		for(int i=a;i<b+1;i++)
			System.out.print(i+" ");
	}
}