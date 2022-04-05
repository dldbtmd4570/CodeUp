import java.util.Scanner;
public class j_1268 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a,index=0;
		for(int i=0;i<n;i++) {
			a=s.nextInt();
			if(a%2==0)
				index++;
		}
		System.out.print(index);
	}
}