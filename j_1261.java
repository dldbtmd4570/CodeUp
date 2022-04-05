import java.util.Scanner;
public class j_1261 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,index=0,total=0;
		for(int i=0;i<10;i++) {
			n=s.nextInt();
			if(n%5==0 && index==0)
			{
				index++;
				total=n;
			}
		}
		System.out.print(total);
	}
}