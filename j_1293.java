import java.util.Scanner;
public class j_1293 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int score,max=1,min=100;
		for(int i=0;i<n;i++) {
			score=s.nextInt();
			if(max<score)
				max=score;
			if(min>score)
				min=score;
		}
		System.out.print(max+" "+min);
	}
}