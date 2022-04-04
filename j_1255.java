import java.util.Scanner;
public class j_1255 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        double b=s.nextDouble();
        for(double i=a;i<=b;i+=0.01)
            System.out.printf("%.2f ",i);
    }
}