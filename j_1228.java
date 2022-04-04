import java.util.Scanner;
public class j_1228 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double h=s.nextDouble();
        double kg=s.nextDouble();
        double akg=(h-100)*0.9;
        double bmi=(kg-akg)*100/akg;
        if(bmi>20)
            System.out.print("비만");
        else if(bmi>10)
            System.out.print("과체중");
        else
            System.out.print("정상");
    }
}
