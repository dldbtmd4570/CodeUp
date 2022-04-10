import java.util.Scanner;
public class j_1281 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				sum+=(-i);
				System.out.print("-"+i);
			}else {
				sum+=i;
				if(i!=a) {
					System.out.print("+");
					System.out.print(i);
				}
				else {
					System.out.print(i);
				}
			}
		}
		System.out.print("="+sum);
	}
}