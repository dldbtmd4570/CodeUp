import java.util.Scanner;
public class j_1270 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int index=0;
		for(int i=1;i<=n;i++) {
			if(i%10==1)
				index++;
		}
		System.out.println(index);
	}
}