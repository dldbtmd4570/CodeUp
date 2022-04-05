import java.util.Scanner;
public class j_1274 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int index=0;
		for(int i=1;i<=n;i++)
			if(n%i==0)
				index++;
		if(index==2)
			System.out.print("prime");
		else
			System.out.print("not prime");
	}
}