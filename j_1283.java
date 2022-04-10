import java.util.Scanner;
public class j_1283 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double a=s.nextInt();
		double money=a;
		int b=s.nextInt();
		int data;
		for(int i=0;i<b;i++) {
			data=s.nextInt();
			if(data>0)
				money+=(money*data/100);
			else
				money-=(-1*money*data/100);
		}
		if(a>money) {
			System.out.printf("%.0f\n",money-a);
			System.out.print("bad");
		}
		else if(a==money) {
			System.out.printf("%.0f\n",money-a);
			System.out.print("same");
		}
		else {
			System.out.printf("%.0f\n",money-a);
			System.out.print("good");
		}
	}
}