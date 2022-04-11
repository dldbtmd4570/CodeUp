import java.util.Scanner;
public class j_1291 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int index=0;
		for(int i=1;i<=3000;i++) {
			if(a%i==0 && b%i==0 && c%i==0) {
				index=i;
			}
		}
		System.out.print(index);
	}
}