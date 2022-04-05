import java.util.Scanner;
public class j_1260 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int sum=0;
        for(int i=a;i<b+1;i++)
            if (i%3==0)
                sum += i;
        System.out.printf("%d",sum);
    }
}