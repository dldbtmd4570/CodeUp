import java.util.Scanner;
public class j_1272 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		int h=s.nextInt();
		int sum=0,j=1;
		for(int i=1;i<=k;i++) {
			if(i%2==0)
				j*=10;
			else {
				j/=10;
				j++;
			}
		}
		sum+=j;
		j=1;
		for(int i=1;i<=h;i++) {
			if(i%2==0)
				j*=10;
			else {
				j/=10;
				j++;
			}
		}
		sum+=j;
		System.out.print(sum);
	}
}