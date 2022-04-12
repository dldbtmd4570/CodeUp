import java.util.Scanner;
public class j_1351 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		for(int i=num1;i<=num2;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
}