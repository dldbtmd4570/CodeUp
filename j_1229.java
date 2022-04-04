import java.util.Scanner;
public class j_1229 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double st_w,bmi;
		double h=s.nextDouble();
		double w=s.nextDouble();
		
		if(h<150)
			st_w=h-100;
		else if(h>=150 && h<160)
			st_w=(h-150)/2+50;
		else
			st_w=(h-100)*0.9;
		
		bmi=(w-st_w)*100/st_w;
		
		if(bmi<=10)
			System.out.print("정상");
		else if(bmi>10 && bmi<=20)
			System.out.print("과체중");
		else
			System.out.print("비만");
	}
}