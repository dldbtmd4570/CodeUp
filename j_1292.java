import java.util.Scanner;
public class j_1292{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long num=0;
		long sum=0;
		num=s.nextLong();
		while(num!=0) {
			sum+=num%10;
			num/=10;
		}
		if(sum%7==4)
			System.out.println("suspect");
		else
			System.out.println("citizen");
	}
}